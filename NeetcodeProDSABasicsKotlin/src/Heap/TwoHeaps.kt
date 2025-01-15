package Heap

import java.util.PriorityQueue
//maxHeap contains small elements
//minHeap contains big elements
class TwoHeaps {
    private val maxHeap = PriorityQueue<Int>(compareByDescending{it})
    private val minHeap = PriorityQueue<Int>()
    fun insert(num:Int){
        maxHeap.add(num)
        val maxHeapRoot = maxHeap.peek()
        val minHeapRoot = minHeap.peek()
        if(maxHeap.isNotEmpty() && minHeap.isNotEmpty() && maxHeapRoot > minHeapRoot)
        {
            minHeap.add(maxHeap.poll())
        }
        when{
            maxHeap.size > minHeap.size + 1 -> {
                minHeap.add(maxHeap.poll())
            }
            minHeap.size > maxHeap.size + 1 ->{
                maxHeap.add(minHeap.poll())
            }
        }
    }
    fun getMedian():Double{
        val maxHeapRoot = maxHeap.peek()
        val minHeapRoot = minHeap.peek()
        return when {
            maxHeap.size > minHeap.size -> maxHeapRoot.toDouble()
            minHeap.size > maxHeap.size -> minHeapRoot.toDouble()
            else -> (maxHeapRoot + minHeapRoot) / 2.0
        }
    }
}