class User {
  constructor(username) {
    this.username = username;
  }
  logme() {
    console.log(`username is ${this.username}`);
  }
  static createId() {   //we not want to give acces to any one thats why static 
    return `123`;
  }
}

// const gaurav = new User("Gaurav");
// console.log(gaurav.createId());


class Teacher extends User{
    constructor(username,email){
        super(username)
        this.email=email

    }
}
const iphone = new Teacher("iphone","u@phone)") 
iphone.logme()
// console.log(iphone.createId());  // no acces becaus of child 

