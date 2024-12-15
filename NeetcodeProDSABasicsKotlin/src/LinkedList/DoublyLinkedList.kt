package LinkedList

class DoublyLinkedList {
    var head = DoublyLinkedListNode(-1)
    var tail = DoublyLinkedListNode(-1)
    constructor(){
        head.next = tail
        tail.prev = head
    }
    fun insertFront(insertValue:Int){
        val newNode = DoublyLinkedListNode(insertValue)
        newNode.next = head.next
        newNode.prev = head

        head.next!!.prev = newNode
        head.next = newNode

    }
    fun removeFront(){
        head.next = head.next!!.next
        head.next!!.prev = head
    }

    fun removeEnd(){
        tail.prev = tail.prev!!.prev
        tail.prev!!.next = tail
    }

    fun insertEnd(insertValue: Int){
        val newNode = DoublyLinkedListNode(insertValue)
        newNode.prev = tail.prev
        newNode.next = tail

        tail.prev!!.next  = newNode
        tail.prev = newNode
    }
    override fun toString(): String {
        var curr:DoublyLinkedListNode? = head.next
        var outputString = ""
        while(curr != tail) {
            outputString += "${curr?.`val`}"
            if (curr?.next != tail)
                outputString += "->"
            curr = curr!!.next
        }
        return outputString

    }
}