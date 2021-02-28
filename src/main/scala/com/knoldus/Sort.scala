package com.knoldus

object Sort
{
  // this quickSort method uses the Quick Sort algorithm in a concise way to sort the elements of a given list.
  def quickSort(inputListToSort: List[Int]): List[Int] = {

    // If the input list has no elements or has a single element, it means the list is already sorted so it will return the list as it it.
    if (inputListToSort.length <= 1) {
      inputListToSort
    }
    else {
      // executes when the input list has more than one element.
      //will pick an element from the middle as a pivot.
      val pivot = inputListToSort(inputListToSort.length/2)

      /* Then partition the input list into three sub-lists containing elements that are
       less than, equals to or greater than the pivot element respectively. After this,
       sort the first and third sublist by a recursive call to the quickSort method.
       * Finally the sorted list will be obtained by concatenating the three sub-lists together.
       */
      List.concat(
        quickSort(inputListToSort filter (pivot >)),
        inputListToSort filter (pivot ==),
        quickSort(inputListToSort filter (pivot <)))
    }

  }

  def main(args: Array[String]): Unit = {
    val givenList=List(8,6,4,9,5,2,3)
    val sortedList=quickSort(givenList)
    println("After sorting, the given "+givenList+" becomes "+sortedList)
  }
}
