// lets learn about promises, async & await in js.

console.log("Starting of file");

async function func() {
  console.log("Inside the func function");

  const responce = await fetch("https://api.gihub.com/users");

  console.log("before respince");

  const users = await responce.json();

  console.log("users resolved");

  return users;
}

console.log("Before calling func");

let a = func();

console.log("After calling func");
console.log(a);

a.then((data) => console.log(data));

console.log("end of file");
