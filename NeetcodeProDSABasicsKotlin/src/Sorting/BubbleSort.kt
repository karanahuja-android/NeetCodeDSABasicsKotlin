package Sorting

class BubbleSort {

    companion object{
        fun swapWithNext(input:IntArray,j:Int){
            val tmp = input[j+1]
            input[j+1] = input[j]
            input[j] = tmp
        }
        fun sort(input:IntArray){
            val n = input.size
            for(i in 0 until n - 1){
                for(j in 0 until n - i - 1)
                    if(input[j] > input[j+1])
                        swapWithNext(input,j)
            }
        }
    }

}