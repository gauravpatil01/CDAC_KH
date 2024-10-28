(function one() {
  console.log(`db connected`);
})();

(() => {
  console.log(`db not connectd`);
})();

((name) => {
  console.log(`db not connectd because of ${name}`);
})("gaurav");

//use ; for stop the execution 