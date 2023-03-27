function varFun(){
    var name = "name";
    console.log(name);
    // name var has a function scope
}

varFun();
// console.log(name);


if(true){
    let age = 22;
    console.log(age);

    // 

}

console.log(age);
