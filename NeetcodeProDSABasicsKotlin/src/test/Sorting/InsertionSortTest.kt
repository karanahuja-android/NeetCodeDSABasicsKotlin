package test.Sorting

import Sorting.InsertionSort
import org.junit.jupiter.api.Test

class InsertionSortTest {
    @Test
    fun sort(){
        val input = intArrayOf(5,4,3,2,1)
        InsertionSort.sort(input)
        input.forEach {
            println(it)
        }
    }
}