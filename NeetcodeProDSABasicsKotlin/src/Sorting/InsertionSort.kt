package Sorting

class InsertionSort {
    companion object{
        fun sort(input:IntArray){
           val n = input.size
            for(i in 0 ..n - 2){
                val x = input[i+1]
                var j = i
                while (j >=0 && input[j] > x){
                    input[j+1] = input[j]
                    j--
                }
                input[j+1] = x
            }
        }
    }
}