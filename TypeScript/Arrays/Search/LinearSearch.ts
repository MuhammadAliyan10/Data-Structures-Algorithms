const LinearSearch = (arr: number[], searchNumber: number): void => {
  if (arr == null || arr.length <= 1) {
    return;
  }
  let numFound: boolean = false;
  let index: number = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === searchNumber) {
      numFound = true;
      index = i;
    }
  }
  if (numFound) {
    console.log(`The number is found at the index of ${index + 1}`);
  } else {
    console.log("404- Not found.");
  }
};

let arr: number[] = [32, 43, 5, 3, 2, 34233, 23];
LinearSearch(arr, 23);
