// use in shopping website ordercard mostly 

const myNums =[1,2,3]
const myTotle =myNums.reduce((accumilator ,currentvalue) =>{
    console.log(`acc:${accumilator} and currentvalue is ${currentvalue}`);
    
    return accumilator +currentvalue;
},0) // 0 initial value   we can give any value 

console.log(myTotle);


const shoppingCart = [
    {
        itemName: "js course",
        price: 2999
    },
    {
        itemName: "py course",
        price: 999
    },
    {
        itemName: "mobile dev course",
        price: 5999
    },
    {
        itemName: "data science course",
        price: 12999
    },
]

// add prices 
const addPrices =shoppingCart.reduce((acc ,item) =>acc+item.price,0 )
console.log(addPrices);
