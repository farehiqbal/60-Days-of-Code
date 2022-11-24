const assert = require("assert");
const ganache = require("ganache-cli");
const Web3 = require("web3");
const provider = ganache.provider();
const web3 = new Web3(provider);
const { enterPlayerInlottery } = require("../util");
const { abi,evm } = require("../compile");

let lottery;
let accounts;

beforeEach(async () =>{

    // get a list of all accounts 
    accounts = await web3.eth.getAccounts();

    // use one of these to deploy our contract

    lottery = await new web3.eth.Contract(abi)
    .deploy({ data:"0x" +  evm.bytecode.object })
    .send({ from: accounts[0], gas: "3000000"});

});
// a suite
describe("Lottery Contract", () => {    // the describe method is used to combine siilar tests together
                                        // take a title and a callback function

                                        // both of them takes  a callback funtion as argument
    it("deploys a contract", () => {        // it, defines a test.
        assert.ok(lottery.options.address);
    });

    it("allows one account to enter", async () => {

        await enterPlayerInlottery(lottery, accounts[1], web3, "0.02");

        const players = await lottery.methods.getPlayers().call({
            from: accounts[0]
        });

        assert.strictEqual(players[0], accounts[1]);
        assert.strictEqual(players.length, 1);


    });

});