package test.Sorting

import Sorting.SelectionSort
import org.junit.jupiter.api.Test

class SelectionSortTest {
    @Test
    fun sortTest(){
        val input = intArrayOf(1,3,2,4,5)
        SelectionSort.sort(input)
        input.forEach { println(it) }
    }
}