package test.LinkedList

import LinkedList.ListNode
import LinkedList.SinglyLinkedList
import org.junit.jupiter.api.Test
import java.lang.classfile.components.ClassPrinter

class SinglyLinkedListTest {
    @Test
    fun singlyLinkedListTest(){
        val one = ListNode(1)
        val two = ListNode(2)
        val three = ListNode(3)
        one.next = two
        two.next = three
        val singlyLinkedList = SinglyLinkedList()
        singlyLinkedList.head.next = one
        singlyLinkedList.tail = three
        println(singlyLinkedList)
    }

    @Test
    fun insertEndTest(){
        val one = ListNode(1)
        val two = ListNode(2)
        val three = ListNode(3)
        one.next = two
        two.next = three
        val singlyLinkedList = SinglyLinkedList()
        singlyLinkedList.head.next = one
        singlyLinkedList.tail = three
        singlyLinkedList.insertEnd(4)
        singlyLinkedList.insertEnd(5)
        println(singlyLinkedList)
    }

    @Test
    fun removeNodeTest(){
        val one = ListNode(1)
        val two = ListNode(2)
        val three = ListNode(3)
        one.next = two
        two.next = three
        val singlyLinkedList = SinglyLinkedList()
        singlyLinkedList.head.next = one
        singlyLinkedList.tail = three
        singlyLinkedList.insertEnd(4)
        singlyLinkedList.insertEnd(5)
        singlyLinkedList.remove(4)
        singlyLinkedList.remove(3)
        println(singlyLinkedList)
    }


}