package test.Sorting

import Sorting.BubbleSort
import org.junit.jupiter.api.Test

class BubbleSortTest {
    @Test
    fun sortTest(){
        val input = intArrayOf(3,4,5,2,1)
        BubbleSort.sort(input)
        input.forEach {
            println(it)
        }

    }
}