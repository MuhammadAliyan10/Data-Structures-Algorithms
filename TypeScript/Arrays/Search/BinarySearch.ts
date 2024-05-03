const BinarySearch = (arr: number[], searchNumber: number): number => {
  arr = arr.sort((a, b) => a - b);
  let left: number = 0;
  let right: number = arr.length - 1;
  while (left <= right) {
    let mid: number = left + Math.floor((right - left) / 2);
    if (arr[mid] === searchNumber) {
      return mid;
    }
    if (arr[mid] < searchNumber) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  return -1;
};

let arr: number[] = [32, 43, 5, 3, 2, 34233, 23];
let index: number = BinarySearch(arr, 23);
if (index === -1) {
  console.log("Number not found.");
} else {
  console.log(`The number is found at the index of ${index}`);
}
