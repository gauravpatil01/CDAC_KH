const myNumbers=[1,2,3,4,5,6,7,8,9,10]

const addTen = myNumbers.map( (item)=>item +10 )
// console.log(addTen);

const addTenwithScopeUseReturn = myNumbers.map( (item)=>
{
    return item +10 ;
}
)
// console.log(addTenwithScopeUseReturn);

const mul = myNumbers.map(  (num)  =>num*10 )
// console.log(mul);


const chaning = myNumbers
                    .map(  (num)  =>num*10 )   //result 1  //output 10,20,30,40  likewise
                    .map((num)=>num +1)                 // result 1 result came here first then perform it action  // output is like 11,21,31  likewise  
                    .filter((num)=>num >=41)
console.log(chaning);



