package LinkedList

class SinglyLinkedList {
    var head = ListNode(-1)
    var tail = head

    fun insertEnd(insertValue:Int){
        tail.next = ListNode(insertValue)
        tail = tail.next!!
    }

    fun remove(index:Int){
        var curr = head
        var i = 0
        while(i < index){
            i++
            curr = curr.next!!
        }
        if(curr.next == tail){
            tail = curr
        }
        curr.next = curr.next!!.next
    }

    override fun toString(): String {
        var curr = head.next
        var outputString = ""
        while (curr != null){
            when{
                curr.next == null -> outputString += "${curr.`val`}"
                else -> outputString += "${curr.`val`} ->"
            }
            curr = curr.next
        }
        return outputString
    }
}