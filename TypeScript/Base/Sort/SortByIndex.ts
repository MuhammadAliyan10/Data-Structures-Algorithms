let arrToSort: number[] = [20,31,3,45,65,23,12]

for (let i = 0; i < arrToSort.length -1; i++) {
   let minimumNumberIndex : number = i
   for (let j = i + 1; j < arrToSort.length; j++) {
    if (arrToSort[j] < arrToSort[minimumNumberIndex]) {
        minimumNumberIndex = j
    }
   }
   let temp : number = arrToSort[i]
   arrToSort[i] = arrToSort[minimumNumberIndex]
   arrToSort[minimumNumberIndex] = temp
}

console.log(arrToSort);

