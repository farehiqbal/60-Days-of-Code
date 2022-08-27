function sayHello(name){
    console.log(name);
}




// console.log(window);
// There is a window object in js which contains all the current object, in the browser
// All the object we use such as setTimeout() are stored in the window.


// console.log(global.sayHello());
// node uses the global object but it does not store it inside global.

// node divides the code in modules to prevent overwriting.
// app is the main module.

// console.log(module);

const logger = require('./loader');


// logger.log('message');

const EventEmitter = require('events');
const emmitter = new EventEmitter();

// Register a listener
emmitter.on('messageLogged', function(){
    console.log('Listener called');
});


// Raise an event
emmitter.emit('message loaded');