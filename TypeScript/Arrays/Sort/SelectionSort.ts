const ascendingOrder = (arrToSort: number[])=>{
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
}

const descendingOrder = (arrToSort: number[])=>{
for (let i = 0; i < arrToSort.length -1; i++) {
   let maximumNumberIndex : number = i
   for (let j = i + 1; j < arrToSort.length; j++) {
    if (arrToSort[j] > arrToSort[maximumNumberIndex]) {
        maximumNumberIndex = j
    }
   }
   let temp : number = arrToSort[i]
   arrToSort[i] = arrToSort[maximumNumberIndex]
   arrToSort[maximumNumberIndex] = temp
}
console.log(arrToSort);
}


let arrToSort: number[] = [20,31,3,45,65,23,12]
ascendingOrder(arrToSort)
descendingOrder(arrToSort)