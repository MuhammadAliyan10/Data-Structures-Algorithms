import time
import random
import sys
sys.path.append('../Sort')
from BubbleSort import BubbleSort
from InsertionSort import InsertionSort
from SelectionSort import SelectionSort
from QuickSort import QuickSort


def generateRandomNumber(amount : int) -> list[int]:
    return [random.randint(1,100) for _ in range(amount)]

if __name__ == '__main__':
    def BubbleSortTimeOut() -> None:
        startTime = time.time()
        BubbleSort(generateRandomNumber(500))
        endTime = time.time()
        duration = endTime - startTime
        print(f"Bubble sort takes {round(duration,3)}'s duration.")
    def InsertionSortTimeOut() -> None:
        startTime = time.time()
        InsertionSort(generateRandomNumber(500))
        endTime = time.time()
        duration = endTime - startTime
        print(f"Insertion sort takes {round(duration,3)}'s duration.")
    def SelectionSortTimeOut() -> None:
        startTime = time.time()
        SelectionSort(generateRandomNumber(500))
        endTime = time.time()
        duration = endTime - startTime
        print(f"Selection sort takes {round(duration, 4)}'s duration.")
    def QuickSortTimeOut() -> None:
        startTime = time.time()
        QuickSort(generateRandomNumber(500))
        endTime = time.time()
        duration = endTime - startTime
        print(f"Quick sort takes {round(duration,3)}'s duration.")

        
    BubbleSortTimeOut()
    QuickSortTimeOut()
    InsertionSortTimeOut()
    SelectionSortTimeOut()