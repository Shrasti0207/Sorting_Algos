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


}

