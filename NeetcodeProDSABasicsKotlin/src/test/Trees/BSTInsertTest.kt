package test.Trees

import Trees.BSTInsert
import Trees.BSTTraversal
import Trees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BSTInsertTest {
    @Test
    fun bstInsertTest(){
        val four = TreeNode(4)
        val three = TreeNode(3)
        val six = TreeNode(6)
        val two = TreeNode(2)
        val five = TreeNode(5)
        val seven = TreeNode(7)
        four.left = three
        four.right = six
//        three.left = two
//        six.left = five
//        six.right = seven
        BSTTraversal.inOrderTraversal(BSTInsert.insert(four,5))
    }
}
