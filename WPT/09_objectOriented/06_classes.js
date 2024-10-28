//ES6

// class User {
//   constructor(username, email, password) {
//     this.username = username;
//     this.email = email;
//     this.password = password;
//   }
//   encryptPassword() {
//     return `${this.password}abc`;
//   }
//   capitalizedUser() {
//     return `${this.username.toUpperCase()}abc`;
//   }
// }

// const user1 = new User("gaurav", "gaurav@gmail.vom", "123");
// console.log(user1.encryptPassword());
// console.log(user1.capitalizedUser());

//behind the scence

function User(username, email, password) {
  this.username = username;
  this.email = email;
  this.password = password;
}

User.prototype.encryptPassword = function () {
  return `${this.password}abc`;
};
User.prototype.capitalizedUser = function () {
  return `${this.username.toUpperCase()}abc`;
};
const user2 = new User("rahul", "rahul@gmail.vom", "123");
console.log(user2.encryptPassword());
console.log(user2.capitalizedUser());
