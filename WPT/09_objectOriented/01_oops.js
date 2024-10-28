const user = {
  username: "gaurav",
  loginCount: 8,
  signedIn: true,
  getUserDetails: function () {
    console.log("got user details");
    // console.log(`$username`);//not allowed
    // console.log(`${this.username}`);
    console.log(this);
  },
};
console.log(user.username);
console.log(user.getUserDetails());
console.log(this);


//constructor function  

// const promiseOne =new Promise()
// const date = new Date () 


function User (username ,loginCount ,isLoginedIn){
    this.username=username,
    this.loginCount=loginCount,
    this.isLoginedIn =isLoginedIn
    return this;
}
const userOne =User("gaurav",12,true)
const userTwo =User("sneha",11,false)

// console.log(userOne);  // it over ride value 
// console.log(userTwo);  // it over ride value 

const userThree =new User("gaurav",12,true)
const userFour =new User("sneha",11,false)


console.log(userThree);  
console.log(userFour);  