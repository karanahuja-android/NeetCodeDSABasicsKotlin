package test.Heap

import Heap.TwoHeaps
import org.junit.jupiter.api.Test

class TwoHeapsTest {
    @Test
    fun testMedian(){
        val myTwoHeaps = TwoHeaps()
        myTwoHeaps.insert(1)
        println(myTwoHeaps.getMedian())
        myTwoHeaps.insert(2)
        println(myTwoHeaps.getMedian())
        myTwoHeaps.insert(3)
        println(myTwoHeaps.getMedian())
        myTwoHeaps.insert(4)
        println(myTwoHeaps.getMedian())
        myTwoHeaps.insert(5)
        println(myTwoHeaps.getMedian())

    }
}