package Graph

class SegmentTree {
    companion object{
        val segmentTree = IntArray(400)
        var input = IntArray(100)
        fun buildTree(ind:Int,l:Int,h:Int){
            if(l == h) {
                segmentTree[ind] = input[l]
                return
            }
            val m = (l + h) / 2
            val lIndex = 2 * ind + 1
            val rIndex = 2 * ind + 2
            println("---------- $lIndex -------- ")
            buildTree(lIndex,l,m)
            buildTree(rIndex,m+1,h)
            segmentTree[ind] = Math.max(
                segmentTree[lIndex],
                segmentTree[rIndex]
            )
        }
        fun query(ind:Int,l:Int,h:Int,lIn:Int,hIn:Int):Int{
            if(l >= lIn && h <= hIn)
                return segmentTree[ind]
            if(l > hIn || h < lIn)
                return Int.MIN_VALUE
            val m = (l+h) / 2
            val lIndex = 2 * ind + 1
            val hIndex = 2 * ind + 2
            val left = query(lIndex,l,m,lIn,hIn)
            val right = query(hIndex,m+1,h,lIn,hIn)
            return Math.max(left,right)

        }

    }
}