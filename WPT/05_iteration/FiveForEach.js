// for each
//last loop is main for object

const coding = ["js", "ruby", "java", "python", "cpp"];

// coding.forEach(  function name()  {}  )

// call back function   ==>name is not present

console.log(
  "For each using collabck  -------------------------------------------------------"
);
coding.forEach(function (item) {
  console.log(item);
});

console.log();
console.log(
  "For each using collabck (with arrow) -------------------------------------------------------"
);

coding.forEach((item) => {
  console.log(item);
});

console.log(
  "For each on function -------------------------------------------------------"
);

function printMe(item) {
  console.log(item);
}
coding.forEach(printMe);

console.log(
  "For each with different parameter(name we can change arrList to a or abc )  -------------------------------------------------------"
);

coding.forEach((item, index, arrList) => {
  console.log(item, index, arrList);
});

console.log(
  "For each on object -------------------------------------------------------"
);

const myCoding = [
  {
    languageName: "javaScript",
    lanFileName: "js",
  },
  {
    languageName: "cLanguage",
    lanFileName: "c",
  },
  {
    languageName: "python",
    lanFileName: "p",
  },
];

myCoding.forEach((item) => {
  console.log(item.languageName);
});
