package Array

class SlidingWindowFIxedSize {
    companion object{
        fun isDuplicatesNearbyBrute(input:IntArray,k:Int):Boolean{
            for(i in 0 until input.size){
                for(j in i+1 until Math.min(input.size,i+k)){
                    if(input[i] == input[j])
                        return true
                }
            }
            return false
        }
        fun isDuplicatesNearbyLinear(input:IntArray,k:Int):Boolean{
            val windowElementsSet = hashSetOf<Int>()
            var i = 0
            for (j in 0 until input.size){
                if(j - i + 1 > k){
                    windowElementsSet.remove(input[i])
                    i++
                }
                if(windowElementsSet.contains(input[j]))
                    return true
                windowElementsSet.add(input[j])
            }
            return false

        }
    }
}