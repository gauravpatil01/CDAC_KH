require ('dotenv').config()
const exprees = require("express");
// or
// import exprees from "express";

const app = exprees();

const port = 4000;

app.get('/', (req, res) => {
  res.send(`Hello World`);
});

app.get('/twitter',(req,res)=>{
    res.send('gaurav_01_patil')
})
app.get('/login',(req,res)=>{
    res.send('<h1> login at Homex  <h1/>')
})
app.get('/youtube',(req ,res)=>{
    res.send('Gaurav patil')
})

app.listen(process.env.PORT, () => {
  console.log(`Example app listining on port ${port}`);
});
