function SetUserName(username){
    this.username =username;


}

function createUser(username,email,password){     
    SetUserName.call(this,username)      //this not call so       --> SetUserName(username)    so we give  call and this where after call this is first statement     
    this.email =email                         
    this.password = password
}

const gaurav =new createUser("gaurav","gaurav@gmail", "123")
console.log(gaurav);
