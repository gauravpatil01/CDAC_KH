//array

// const myArr = [0, 1, 2, 3, 4, 5, 6, 7, 8, "Gaurav"];
// const myHeros = ["shaktiman", "nagtraj"];

// console.log(myArr[1]);

// array method
// const myArr = [0, 1, 2, 3, 4, 5];
// myArr.push(6)
// myArr.push(7)
// myArr.pop()
// console.log(myArr);

// const myArr = [0, 1, 2, 3, 4, 5];
// myArr.unshift(9);
// console.log(myArr);
// myArr.shift();

// console.log(myArr.includes(9));
// console.log(myArr.indexOf(9));

// const newArray =myArr.join();

// console.log(myArr);//[ 0, 1, 2, 3, 4, 5 ]
// console.log(newArray);//0,1,2,3,4,5   type i s string because of join

//slice ,splice
const myArr = [0, 1, 2, 3, 4, 5];
console.log("A", myArr);
const myn1 = myArr.slice(1, 3);
console.log(myn1);
console.log("B", myArr);

const myn2 = myArr.splice(1, 3);
console.log(myn2);
