package test.Heap

import Heap.Heap
import org.junit.jupiter.api.Test

class HeapTest {
    @Test
    fun createHeapTest(){
        val myHeap = Heap()
        myHeap.heapList.addAll(listOf(14,19,16,21,26,19,68,65,30))
        println(myHeap)
    }
    @Test
    fun pushTest(){
        val myHeap = Heap()
        myHeap.heapList.addAll(listOf(14,19,16,21,26,19,68,65,30))
        myHeap.push(2)
        println(myHeap)

    }

    @Test
    fun popTest(){
        val myHeap = Heap()
        myHeap.heapList.addAll(listOf(14,19,16,21,26,19,68,65,30))
        println(myHeap)
        myHeap.pop()
//        myHeap.pop()
        println(myHeap)
    }
}