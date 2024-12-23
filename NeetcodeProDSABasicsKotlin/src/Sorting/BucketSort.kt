package Sorting

class BucketSort {
    fun sort(input:IntArray){
        val counts = intArrayOf(0,0,0)
        input.forEach{
            when{
                it == 0 ->counts[0] +=1
                it  == 1 -> counts[1] += 1
                it == 2 -> counts[2] += 1
            }
            var k = 0
            for(i in 0..2)
                for(j in 0 until counts[i]) {
                    input[k] = i
                    k++
                }

        }
    }
}