// function Hello(){
//     console.log("Hello mf world");
// }

// Hello();


// A function that does not have a name is called anonymous function.

// Use arrow fuctions to write anynoymous functions.

var magic = function(){
    return new Date();
}

// Its equivalent to

var magic2 =() => {
    return new Date;
}

const magic3 = () => new Date;

console.log(magic());
console.log(magic2());
console.log(magic3());