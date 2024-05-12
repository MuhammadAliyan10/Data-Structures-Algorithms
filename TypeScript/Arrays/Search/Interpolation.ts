const Interpolation = (arr: number[], target: number): number => {
  let low: number = 0;
  let high: number = arr.length - 1;
  while (low <= high) {
    let pos: number =
      low +
      Math.floor(((high - low) * (target - arr[low])) / (arr[high] - arr[low]));

    if (arr[pos] == target) {
      return pos;
    }
    if (arr[pos] < target) {
      low = pos + 1;
    } else {
      high = pos - 1;
    }
  }
  return -1;
};

let arrS: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log(Interpolation(arrS, 7));
