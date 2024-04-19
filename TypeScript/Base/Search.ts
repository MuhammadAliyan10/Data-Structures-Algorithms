const arrSearch: number[] = [23, 3, 2, 0, 2];
const searchNumber: number = 0;
let isFound: boolean = false;
let index: number = 0;
for (let i = 0; i < arrSearch.length; i++) {
  if (arrSearch[i] === searchNumber) {
    isFound = true;
    index = i;
  }
}

if (isFound) {
  console.log("The number is found at index " + index);
} else {
  console.log("Number not found.");
}
