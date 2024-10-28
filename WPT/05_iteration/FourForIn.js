//for in for object printing
console.log(
  "for in syntax -------------------------------------------------------"
);
console.log();

const myObject = {
  js: "javasctript",
  cpp: "c++",
  rb: "ruby",
  swift: "swift",
};

for (const value in myObject) {
  console.log(value);
}

console.log();
console.log(
  "values print-------------------------------------------------------"
);

for (const keys in myObject) {
  console.log(myObject[keys]);
}

console.log(
  "keys and value print -------------------------------------------------------"
);

for (const keys in myObject) {
  console.log(`${keys} short cut is for ${myObject[keys]}`);
}

console.log(
  "For in loop in array  -------------------------------------------------------"
);

const programming = ["js", "cpp", "java"];
for (const keys in programming) {
  console.log(keys);

  console.log(programming[keys]);
}

console.log(
  "For in loop in Map  NOT ALLOWED  -------------------------------------------------------"
);
const map = new Map();
map.set("IN", "india");
map.set("USA", "america");
map.set("FR", "france");

for (const keys in map) {
  console.log(keys);
}
