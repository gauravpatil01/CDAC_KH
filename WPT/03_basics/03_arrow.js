const user = {
  username: "Gaurav",
  price: 999,

  welcomeMessage: function () {
    console.log(`${this.username} , welcome to website`);
    console.log(this); //current context
  },
};

// user.welcomeMessage()       //hitesh welcome to website
// user.username = "sam"
// user.welcomeMessage()       // sam welcome to website

// console.log(this);        //  {}  empty object   // its for node enviroment  but if we do  in browser  then its window

// function chai(){
//     let username = "hitesh"
//     console.log(this.username);      //undefined
// }

// chai()

// const chai = function () {
//     let username = "hitesh"
//     console.log(this.username);          // undefined
// }

const chai = () => {
  let username = "Gaurav";
  console.log(this); //  {}
};

// chai()

// const addTwo = (num1, num2) => {
//     return num1 + num2
// }

// const addTwo = (num1, num2) =>  num1 + num2

// const addTwo = (num1, num2) => ( num1 + num2 )

const addTwo = (num1, num2) => ({ username: "Gaurav" });

console.log(addTwo(3, 4));

// const myArray = [2, 5, 3, 7, 8]

// myArray.forEach()
