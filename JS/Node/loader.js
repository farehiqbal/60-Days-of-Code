// This code explains how to export a module to main module i.e. app.js

var url = 'http://myloader.io/log';

function log (message){
    console.log(message);
}


// before, our exports were empty

module.exports.log = log;