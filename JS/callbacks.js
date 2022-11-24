// In js, functions are objects, and we can pass objects to functions i.e. pass functions to functions.

// print method takes another fuction as parameter and callsit inside.

// a function that is passed to another function as parameter is called callback function.
function print(callback) {
  callback();
}

// but why callback? js runs sequintially in top down order. In some cases, a code must run after something
// else happens. This is called asynchronus programming.

// they make sure that a function runs after a task has been completed.

const message = function () {
  console.log("Display after 3 seconds");
};

setTimeout(message, 3000); // take a callback function and runs it after given milliseconds.

// a function that doesnot have a name is called anonymous functions.

setTimeout(function () {
  console.log("anynoymous displayed after 3s");
}, 3000);

// arrow function is same as anonymous functions

setTimeout(() => {
  console.log("Arrow function callled after 3s");
}, 3000);
