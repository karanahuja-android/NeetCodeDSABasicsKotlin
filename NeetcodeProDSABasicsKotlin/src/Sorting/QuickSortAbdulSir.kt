package Sorting

class QuickSortAbdulSir {
    companion object{
        fun swap(A:IntArray,i:Int,j:Int){
            val tmp = A[j]
            A[j] = A[i]
            A[i] = tmp
        }
        fun partition(A:IntArray,l:Int,h:Int):Int{
            var i = l
            var j = h
            val pivot = A[l]
            while(i < j){
                while (i <=h && A[i] <= pivot )
                    i++
                while (j > -1 && A[j] > pivot)
                    j--
                if(i < j){
                    swap(A,i,j)
                    i++
                    j--
                }
            }
            swap(A,l,j)
            return j
        }
        fun quickSort(A:IntArray,l:Int,h:Int){
            if(l>=h)
                return
            val j = partition(A,l,h)
            quickSort(A,l,j - 1)
            quickSort(A,j+1,h)
        }
    }


}