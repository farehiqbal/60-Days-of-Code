const HDWalletProvider = require('@truffle/hdwallet-provider');
const Web3 = require('web3');
// const { interface, bytecode } = require('./compile');
const { abi, evm } = require('./compile');

const provider = new HDWalletProvider(
    'science salon enact warfare gospel then saddle long decade digital broccoli public',
    'https://rinkeby.infura.io/v3/5eed3152f7994d7dae47e16cd7b04241'

);

const web3 = new Web3(provider);

const deploy = async () => {
    const accounts = await web3.eth.getAccounts();

    console.log("Attempting to deploy from account: ", accounts[0]);

    const result = await new web3.eth.Contract(abi)
    .deploy({ data: "0x" + evm.bytecode.object, arguments: ['Hi there!'] })
    .send({ from:accounts[0], gas:'1000000' });

    console.log("Contract deployed to ", result.options.address);


};

deploy();
