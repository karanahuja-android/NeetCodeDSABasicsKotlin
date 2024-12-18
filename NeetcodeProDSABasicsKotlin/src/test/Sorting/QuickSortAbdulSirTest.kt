package test.Sorting
import org.junit.jupiter.api.Test
import Sorting.QuickSortAbdulSir

class QuickSortAbdulSirTest {
    @Test
    fun sort(){
        val A = intArrayOf(0,1,3,2,4,5)
        QuickSortAbdulSir.quickSort(A,0,5)
        A.forEach {
            println(it)
        }
    }

    @Test
    fun partition(){
        val A = intArrayOf(0,3,5,4,3,2,1)
        println(QuickSortAbdulSir.partition(A,0,6))
    }


}