class User {
  constructor(username) {
    this.username = username;
  }
  logme() {
    console.log(`username login is  ${this.username}`);
  }
}
class Teacher extends User {
  constructor(username, email, password) {
    super(username);
    this.email = email;
    this.password = password;
  }
  addCourse() {
    console.log(`new course added by ${this.username}`);
  }

}

const obj = new Teacher ("gaurav","gaurav@gmail.com","123");
obj.addCourse();

const rahul =new User("rahul");
rahul.logme()

console.log(obj instanceof User);
