import org.scalatest.funsuite.AnyFunSuite

class SortingSpec extends AnyFunSuite {

  val sorting = new Sortings

  test("Test Insertion Sort") {
    val listInput: List[Int] = List(3, 4, 5, 3, 2, 1)
    assert(sorting.insertionSort(listInput) === listInput.sortBy(a => a))
  }

  test("Test Selection Sort") {
    val listInput: List[Int] = List(3, 4, 5, 3, 2, 1)
    assert(sorting.selectionSort(listInput) === listInput.sortBy(a => a))
  }



}