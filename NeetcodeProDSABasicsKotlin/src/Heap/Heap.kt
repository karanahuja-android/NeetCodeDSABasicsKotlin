package Heap

class Heap {
    val heapList = mutableListOf<Int>()
    constructor(){
        heapList.add(-1)
    }
    fun swapWithParent(elemIndex:Int){
        val tmp = heapList.get(elemIndex/2)
        val curr = heapList.get(elemIndex)
        heapList.set(elemIndex/2,curr)
        heapList.set(elemIndex,tmp)

    }
    fun pop():Int{
        if(heapList.size == 2){
            return heapList.removeLast()
        }
        val result = heapList.get(1)
        val lastChild = heapList.removeLast()
        heapList.set(1,lastChild)
        var i = 1
        while(2 * i < heapList.size){
            val leftChild = heapList.get(2 * i)
            val rightChild = heapList.get(2 * i + 1)
            val curr = heapList.get(i)
            if(2*i + 1 < heapList.size &&  rightChild < leftChild && rightChild < curr) {
                swapWithParent(2 * i + 1)
                i = 2 * i +1
            }
            else if(leftChild < curr){
                swapWithParent(2 * i)
                i = 2 * i
            }
            else
                break
        }
        return result


    }
    fun push(newValue:Int){
        heapList.add(newValue)
        var elemIndex = heapList.size - 1
        while(elemIndex > 1 && heapList.get(elemIndex) < heapList.get(elemIndex / 2)){
            swapWithParent(elemIndex)
            elemIndex = elemIndex / 2
        }
    }
    override fun toString(): String {
        return heapList.toString()
    }
}