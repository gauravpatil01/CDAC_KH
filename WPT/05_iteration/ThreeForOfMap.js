//for of
//map

// array specific loop 

// [" ", " " ,""]  array ke andar strings
// [{}, {},{}]        array ke andar Object  ko access karna 


console.log("for of with syntax -----------------------------------------------");

const arr =[1,2,3,4,5]

// for (const element of object) {           object is not a javascript object its a basic turm 
    
// }

for (const num of arr) {
    console.log(num);
    
}

console.log("greeting-------------------------------------------------------------");

const greetings ="hello world"
for(const greet of greetings){
    if(greet ==" ")break
    console.log(`each char is ${greet}`);
    
}

console.log("Map for of-------------------------------------------------------------");


const map =new Map()
map.set("IN" , "india")
map.set("USA" ,"america")
map.set("FR" ,"france")

console.log(map);    //object


for(const [key,value] of map){
    console.log(key ,"  -->",value);
    
}


console.log("For of on Objects------we can not use for of in object  //(we use for in ) -------------------------------------------------------");

const obj ={
    1:"one",
    2:"two",
    3:"three",
    4:"four"
}

for(const value of obj){
    console.log(value);
    
}
