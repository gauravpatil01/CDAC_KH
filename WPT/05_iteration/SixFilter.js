/*      // 1st
const coding = ["js", "ruby", "java", "python", "cpp"];
console.log(
  "For each using collabck  -------------------------------------------------------"
);
coding.forEach((item) => {
  console.log(item);
});
console.log(
    "For each using variable value (it not return)     -------------------------------------------------------"
  );

//store it in value (forEach)
const values = coding.forEach((item) => {
  console.log(item);
  return item                    // not allowed 
});

console.log(values);

*/

 /*      // 2nd 
console.log(
    "Filter also take callback inside it  -------------------------------------------------------"
  );
const myNumbers =[1,2,3,4,5,6,7,8,9,10]

const newNums =myNumbers.filter(  (num) => num >4 )
console.log(newNums);

console.log(
    "Filter with another syntax we use -->  {}  -------------------------------------------------------"
  );

const myNumbers1 =[1,2,3,4,5,6,7,8,9,10]

const newNums1 =myNumbers1.filter(  (num) => {
    return num > 4
})
console.log("Scope --> {} open kiya to return karna padega " );

console.log(newNums1);

*/

/*   // 3rd
console.log("Added to newNums from myNumbers------------------------------------------------------------");

const myNumbers =[1,2,3,4,5,6,7,8,9,10]
const newNums =[]

myNumbers.forEach(  (num)=>{
    if(num > 4 ){
        newNums.push(num)
    }
}  )


console.log(newNums);

*/


const books = [
    { title: 'Book One', genre: 'Fiction', publish: 1981, edition: 2004 },
    { title: 'Book Two', genre: 'Non-Fiction', publish: 1992, edition: 2008 },
    { title: 'Book Three', genre: 'History', publish: 1999, edition: 2007 },
    { title: 'Book Four', genre: 'Non-Fiction', publish: 1989, edition: 2010 },
    { title: 'Book Five', genre: 'Science', publish: 2009, edition: 2014 },
    { title: 'Book Six', genre: 'Fiction', publish: 1987, edition: 2010 },
    { title: 'Book Seven', genre: 'History', publish: 1986, edition: 1996 },
    { title: 'Book Eight', genre: 'Science', publish: 2011, edition: 2016 },
    { title: 'Book Nine', genre: 'Non-Fiction', publish: 1981, edition: 1989 },
  ];

  const userBooks = books.filter( (bk) => bk.genre ==='History' )
//   console.log(userBooks);
  const publishdate =books.filter( (bk)=>
{
   return  bk.publish >=1992        // we also use return here 
}
)
//   console.log(publishdate);
  

  const conCheck =books.filter( (bk)=>
{
   return  bk.publish >=1992 && bk.genre =='History'       // year and genre
}
)
  console.log(conCheck);
  
