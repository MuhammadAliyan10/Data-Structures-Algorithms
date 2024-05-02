const mergeSort = (arr: number[]): void => {
  if (arr == null || arr.length <= 1) {
    return;
  }
  let tempArr: number[] = [];
  sortElements(arr, tempArr, 0, arr.length - 1);
};
const sortElements = (
  arr: number[],
  tempArr: number[],
  left: number,
  right: number
): void => {
  if (left < right) {
    let mid: number = left + Math.floor((right - left) / 2);
    sortElements(arr, tempArr, left, mid);
    sortElements(arr, tempArr, mid + 1, right);
    sortValues(arr, tempArr, left, mid, right);
  }
};
const sortValues = (
  arr: number[],
  tempArr: number[],
  left: number,
  mid: number,
  right: number
): void => {
  for (let i = left; i <= right; i++) {
    tempArr[i] = arr[i];
  }
  let i: number = left;
  let j: number = mid + 1;
  let k: number = left;

  while (i <= mid && j <= right) {
    if (tempArr[i] <= tempArr[j]) {
      arr[k] = tempArr[i];
      i++;
    } else {
      arr[k] = tempArr[j];
      j++;
    }
    k++;
  }
  while (i <= mid) {
    arr[k] = tempArr[i];
    i++;
    k++;
  }
};

let arr: number[] = [43, 2, 4, 67, 23, 45, 67, 22];
mergeSort(arr);
console.log(arr);
