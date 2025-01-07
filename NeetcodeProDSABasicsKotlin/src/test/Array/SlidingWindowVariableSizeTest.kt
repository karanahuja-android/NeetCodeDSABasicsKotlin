package test.Array

import Array.SlidingWindowVariableSize
import org.junit.jupiter.api.Test

class SlidingWindowVariableSizeTest {
    @Test
    fun longestSubArrWithDupeTest(){
        println(SlidingWindowVariableSize.longestSubArrayWithDuplicates(
            intArrayOf(1,2,2,3,3,3,4)
        ))
    }

    @Test
    fun shortestSubArrSumTest(){
        println(SlidingWindowVariableSize.shortestSubArrSum(intArrayOf(1,2,3,1,1,1),4))
    }

}