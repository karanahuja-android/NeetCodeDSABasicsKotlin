package test.Array

import Array.SlidingWindowFIxedSize
import org.junit.jupiter.api.Test

class SlidingWindowFixedSizeTest {
    @Test
    fun isDulplicatesNearbyTest(){
        val input = intArrayOf(1,2,3,4,5,6,5)
        println(SlidingWindowFIxedSize.isDuplicatesNearbyBrute(input,3))
        println(SlidingWindowFIxedSize.isDuplicatesNearbyLinear(input,3))
    }
}