package Sorting

class SelectionSort {
    companion object{
        fun swap(input:IntArray,i:Int,minIndex:Int){
            val tmp = input[i]
            input[i] = input[minIndex]
            input[minIndex] = tmp
        }
        fun sort(input:IntArray){
            val n = input.size
            for (i in 0 until n - 1) {
                var minIndex = i
                for (j in i+1 until n ){
                    if(input[j] < input[minIndex])
                        minIndex = j
                }
                if(minIndex != i)
                    swap(input,i,minIndex)
            }

        }
    }

}