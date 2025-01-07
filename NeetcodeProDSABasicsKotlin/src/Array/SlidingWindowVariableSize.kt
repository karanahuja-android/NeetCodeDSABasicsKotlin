package Array

class SlidingWindowVariableSize {
    companion object{
        fun longestSubArrayWithDuplicates(input:IntArray):Int{
            var longestLength = 0
            var i = 0
            for (j in 0 until input.size){
                if(input[i] != input[j]){
                    i = j
                }
                longestLength = Math.max(longestLength,j - i + 1)
            }
            return longestLength
        }
        fun shortestSubArrSum(input:IntArray,target:Int):Int{
            var i = 0
            var shortestLength = Int.MAX_VALUE
            var total = 0
            for(j in 0 until input.size){
                total += input[j]
                while(total >= target){
                    shortestLength = Math.min(shortestLength, j - i + 1)
                    total -= input[i]
                    i++
                }
            }
            return shortestLength
        }
    }
}