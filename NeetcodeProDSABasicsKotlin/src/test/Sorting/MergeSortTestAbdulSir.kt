package test.Sorting

import Sorting.MergeSortAbdulSir
import org.junit.jupiter.api.Test

class MergeSortTestAbdulSir {
    @Test
    fun mergeTest(){
        val A = intArrayOf(2,4,6,1,3,5)
        MergeSortAbdulSir.merge(A,0,2,5)
        A.forEach {
            println(it)
        }

    }
    @Test
    fun mergeSortTest(){
        val A = intArrayOf(2,4,6,1,3,5)
        MergeSortAbdulSir.mergeSort(A,0,5)
        A.forEach {
            println(it)
        }
    }
}