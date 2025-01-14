package Array

class KadanesAlgo {
    companion object{
        fun maxSum(input:IntArray):Int{
            var maxSum = input[0]
            var currSum = 0
            for(num in input){
                currSum += num
                maxSum = Math.max(maxSum,currSum)
                currSum = Math.max(currSum,0)
            }
            return maxSum
        }
    }
}