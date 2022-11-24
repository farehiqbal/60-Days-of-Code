// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.5.0 <0.9.0;

contract Lottery{
    address public manager;
    address payable[] public players;

    constructor() {
        manager = msg.sender;

    }

    function enter() public payable{

        require(msg.value > .01 ether, "You must send atleast .01 ether to enter lottery");

        players.push(payable(msg.sender));
    }

    function random() private view returns(uint256){
        return uint256(keccak256(abi.encodePacked(block.difficulty, block.timestamp, players)));

    }

    function pickWinner() public restricted {

        uint index = random() % players.length;

        address contractAddress = address(this);

        players[index].transfer(contractAddress.balance);
        players = new address payable[](0); // reset the players array for the next lottery.

    }

    modifier restricted() {
        require (msg.sender == manager);
        _;
    }

    function getPlayers() public view returns (address payable[] memory){
        return players;
    }
}