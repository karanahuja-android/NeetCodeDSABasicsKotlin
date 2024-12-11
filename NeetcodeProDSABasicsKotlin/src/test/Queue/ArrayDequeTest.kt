package test.Queue

import Queue.ArrayDequeDemo
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ArrayDequeTest {
    @Test
    fun ArrayDequeDemoTest(){
        val myDeque = ArrayDeque<Int>()
        myDeque.addAll(listOf(1,2,3))
        println("myDeque is "+myDeque)
        Assertions.assertEquals(ArrayDequeDemo.demo(), myDeque)

    }
}