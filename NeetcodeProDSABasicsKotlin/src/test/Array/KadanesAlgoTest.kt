package test.Array

import Array.KadanesAlgo
import org.junit.jupiter.api.Test

class KadanesAlgoTest {
    @Test
    fun maxSum(){
        val result = KadanesAlgo.maxSum(intArrayOf(-3,3,-2,3))
        println(result)
    }
}