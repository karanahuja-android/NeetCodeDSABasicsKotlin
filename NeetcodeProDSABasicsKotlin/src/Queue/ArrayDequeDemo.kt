package Queue

class ArrayDequeDemo {
    companion object{
        fun demo():ArrayDeque<Int>{
            val myDeque = ArrayDeque<Int>()
            myDeque.addAll(listOf(1,2,3))
            myDeque.removeFirst()
            myDeque.removeLast()
            myDeque.addFirst(1)
            myDeque.addLast(3)
            return myDeque
        }
    }

}