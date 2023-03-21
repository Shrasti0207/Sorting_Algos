import scala.annotation.tailrec

class Sortings {
  def insertionSort(listInput: List[Int]): List[Int] = {
    val myList: List[Int] = listInput

    def helperInsertionSort(myList: List[Int]): List[Int] = {
      if (myList.isEmpty) {
        Nil
      }
      else {
        insert(myList.head, helperInsertionSort(myList.tail))
      }
    }
    def insert(a: Int, myList: List[Int]): List[Int] =
      if (myList.isEmpty || a <= myList.head) {
        a :: myList
      }
      else {
        myList.head :: insert(a, myList.tail)
      }
    helperInsertionSort(myList)
  }
  def selectionSort(listInput: List[Int]): List[Int] = {
    @tailrec
    def innerSelection(listInput: List[Int], list: List[Int] = List()): List[Int] = {
      val min = listInput.min
      val list1 = list ++ listInput.filter(_ == min)
      if (listInput.filter(_ > min).lengthIs == 0) list1
      else innerSelection(listInput.filter(_ > min), list1)
    }

    innerSelection(listInput)
  }

  def bubbleSort(listInput: List[Int]): List[Int]={

    def iterate(listInput: List[Int], count: Int): List[Int] = {
      if (count == listInput.length - 1) listInput
      else iterate(innerBubbleSort(listInput), count + 1)
    }

    def innerBubbleSort(listInput: List[Int]): List[Int] = listInput match {
      case List() => List()
      case List(firstElement) => List(firstElement)
      case firstElement :: secondElement :: restList =>
        if (firstElement > secondElement) secondElement :: innerBubbleSort(firstElement :: restList)
        else firstElement :: innerBubbleSort(secondElement :: restList)
    }
    iterate(listInput, 0)
  }

}

