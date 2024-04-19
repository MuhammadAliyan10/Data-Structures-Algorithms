let arrSort: number[] = [23, 4, 2, 3, 12, 43, 23, 90];

for (let i = arrSort.length - 1; i > 0; i--) {
  for (let j = 0; j < i; j++) {
    if (arrSort[j] > arrSort[j + 1]) {
      let temp = arrSort[j];
      arrSort[j] = arrSort[j + 1];
      arrSort[j + 1] = temp;
    }
  }
}
console.log(arrSort);
