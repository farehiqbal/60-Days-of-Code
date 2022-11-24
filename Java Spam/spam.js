

const Web3 = require('web3');
const provider = require(ganache.provider());

const web3 = new Web3(ganache.provider());

console.log(Web3.givenProvider);