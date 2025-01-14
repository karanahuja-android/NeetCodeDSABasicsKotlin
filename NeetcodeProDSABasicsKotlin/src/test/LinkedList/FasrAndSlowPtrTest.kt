package test.LinkedList

import LinkedList.FastAndSlowPtr
import LinkedList.ListNode
import LinkedList.SinglyLinkedList
import org.junit.jupiter.api.Test

class FasrAndSlowPtrTest {
    @Test
    fun hasCycle(){
        val one = ListNode(1)
        val two = ListNode(2)
        val three = ListNode(3)
        val four = ListNode(4)
        one.next = two
        two.next = three
        three.next = four
        four.next = two
        val singlyLinkedList = SinglyLinkedList()
        singlyLinkedList.head.next = one
        singlyLinkedList.tail = four
        val result = FastAndSlowPtr.hasCycle(singlyLinkedList.head)
        println(result)
    }
}