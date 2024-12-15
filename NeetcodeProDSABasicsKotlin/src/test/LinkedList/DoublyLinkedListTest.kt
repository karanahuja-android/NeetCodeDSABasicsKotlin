package test.LinkedList
import LinkedList.DoublyLinkedList
import LinkedList.DoublyLinkedListNode
import org.junit.jupiter.api.Test

class DoublyLinkedListTest {
    @Test
    fun createDoublyLinkedList(){
        val one = DoublyLinkedListNode(1)
        val two = DoublyLinkedListNode(2)
        val three = DoublyLinkedListNode(3)
        val doublyLinkedList = DoublyLinkedList()
        doublyLinkedList.head.next = one
        one.next = two
        two.next = three
        three.next = doublyLinkedList.tail
        println(doublyLinkedList)

    }

    @Test
    fun insertFrontTest(){
        val one = DoublyLinkedListNode(1)
        val two = DoublyLinkedListNode(2)
        val three = DoublyLinkedListNode(3)
        val doublyLinkedList = DoublyLinkedList()
        doublyLinkedList.head.next = one
        one.next = two
        two.next = three
        three.next = doublyLinkedList.tail
        one.prev = doublyLinkedList.head
        two.prev = one
        three.prev = two
        doublyLinkedList.tail.prev = three
        doublyLinkedList.insertFront(5)
        println(doublyLinkedList)
    }

    @Test
    fun insertEndTest(){
        val one = DoublyLinkedListNode(1)
        val two = DoublyLinkedListNode(2)
        val three = DoublyLinkedListNode(3)
        val doublyLinkedList = DoublyLinkedList()
        doublyLinkedList.head.next = one
        one.next = two
        two.next = three
        three.next = doublyLinkedList.tail
        one.prev = doublyLinkedList.head
        two.prev = one
        three.prev = two
        doublyLinkedList.tail.prev = three
        doublyLinkedList.insertEnd(4)
        println(doublyLinkedList)
    }

    @Test
    fun removeFront(){
        val one = DoublyLinkedListNode(1)
        val two = DoublyLinkedListNode(2)
        val three = DoublyLinkedListNode(3)
        val doublyLinkedList = DoublyLinkedList()
        doublyLinkedList.head.next = one
        one.next = two
        two.next = three
        three.next = doublyLinkedList.tail
        one.prev = doublyLinkedList.head
        two.prev = one
        three.prev = two
        doublyLinkedList.tail.prev = three
        doublyLinkedList.insertFront(5)
        doublyLinkedList.removeFront()
        println(doublyLinkedList)

    }
    @Test
    fun removeEnd() {
        val one = DoublyLinkedListNode(1)
        val two = DoublyLinkedListNode(2)
        val three = DoublyLinkedListNode(3)
        val doublyLinkedList = DoublyLinkedList()
        doublyLinkedList.head.next = one
        one.next = two
        two.next = three
        three.next = doublyLinkedList.tail
        one.prev = doublyLinkedList.head
        two.prev = one
        three.prev = two
        doublyLinkedList.tail.prev = three
        doublyLinkedList.insertEnd(4)
        doublyLinkedList.removeEnd()
        println(doublyLinkedList)
    }

}