const InsertionSort = (arr: number[])=>{
    for (let i = 0; i < arr.length; i++) {
       for (let j = 0; j < i; j++) {
         if (arr[i] < arr[j]) {
             let temp: number = arr[i]
             arr[i] = arr[j]
             arr[j] = temp
         }
       }
        
    }
    console.log(arr);
    
}

let arr : number[] = [2,22,1,65,34,98,4]
InsertionSort(arr)