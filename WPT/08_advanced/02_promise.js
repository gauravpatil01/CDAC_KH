// Syntax
const promiseName = new Promise(function (resolve, reject) {});

console.log(
  "ONE --------------------------------------------------------------------------------------------------"
);

//creation of promise  --> it take callback and also it reduce problemof callback hell
const promiseOne = new Promise(function (resolve, reject) {
  setTimeout(function () {
    console.log("Async task 1 ST is complete");
    resolve(); //using this only propmised consumed
  }, 1000);
});

// consumption
//    resolve directly  connect to .then  -->.then contain one function

promiseOne.then(function () {
  console.log("1 ST promised consumed ");
});

console.log(
  "TWO   it not have name then call dirtectly --------------------------------------------------------------------------------------------------"
);

new Promise(function (resolve, reject) {
  setTimeout(function () {
    console.log("Async task 2");

    resolve();
  }, 1000);
}).then(function name() {
  console.log("2ND promised consumed without name ");
});

console.log(
  "THIRD  resolve data call in then  --------------------------------------------------------------------------------------------------"
);

const promiseThree = new Promise(function (resolve, reject) {
  setTimeout(function () {
    resolve({ username: "chai", email: "test@gmail.com" });
  }, 1000);
});

promiseThree.then(function (user) {
  console.log(user);
});

console.log(
  "Four handling reject  & (how to avoid call back hell )   chaning using .then again   &&  use catch and finnaly  --------------------------------------------------------------------------------------------------"
);

const promiseFour = new Promise(function (resolve, reject) {
  setTimeout(function () {
    let error = true;
    if (!error) {
      resolve({ username: "gaurav", password: "123" });
    } else {
      reject("Eroor : Something went wrong");
    }
  }, 2000);
});

promiseFour
  .then((user) => {
    console.log(user);
    return user.username;
  })
  .then((username) => {
    console.log(username);
  })
  .catch((err) => {
    console.log(err);
  })
  .finally(() => {
    console.log("promise either resolved or rejected ");
  });

console.log(
  "FIVE   PROMISE CAN HANDLE USING ASYNC AWAIT ALSO && asynk and awat use with try catch block  --------------------------------------------------------------------------------------------------"
);

const promiseFive = new Promise(function (resolve, reject) {
  setTimeout(function () {
    let error = false;
    if (!error) {
      resolve({ username: "javascript", password: "123" });
    } else {
      reject("Eroor : JS  went wrong");
    }
  }, 1000);
});

async function consumePromiseFive() {
  try {
    const responce = await promiseFive;
    console.log(responce);
  } catch (error) {
    console.log(error);
  }
}
consumePromiseFive();

async function getAllusers() {
  try {
    const responce = await fetch("https://jsonplaceholder.typicode.com/users");
    const data = await responce.json();
    console.log(data);
    
  } catch (error) {
    console.log("E: ",error);
    
  }
}

getAllusers();


console.log("---------------------------------------------------------------------------------");

fetch('https://api.github.com/users/hiteshchoudhary')
.then((response) => {
    return response.json()
})
.then((data) => {
    console.log(data);
})
.catch((error) => console.log(error))
