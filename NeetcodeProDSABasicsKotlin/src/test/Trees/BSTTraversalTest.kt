package test.Trees

import Trees.BSTTraversal
import Trees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BSTTraversalTest {
    @Test
    fun inorderTraversalOutputTest(){
        val four = TreeNode(4)
        val three = TreeNode(3)
        val six = TreeNode(6)
        val two = TreeNode(2)
        val five = TreeNode(5)
        val seven = TreeNode(7)
        four.left = three
        four.right = six
        three.left = two
        six.left = five
        six.right = seven
        Assertions.assertEquals(listOf(1,2,3,4), mutableListOf(1,2,3,4))
        Assertions.assertEquals(BSTTraversal.inOrderTraversalOutput(four), listOf(2,3,4,5,6,7))
    }
    @Test
    fun inorderTraversalTest(){
        val four = TreeNode(4)
        val three = TreeNode(3)
        val six = TreeNode(6)
        val two = TreeNode(2)
        val five = TreeNode(5)
        val seven = TreeNode(7)
        four.left = three
        four.right = six
        three.left = two
        six.left = five
        six.right = seven
        println("-----------inorder traversal ----------------")
        BSTTraversal.inOrderTraversal(four)
        println("-----------preorder traversal ----------------")
        BSTTraversal.preOrderTraversal(four)
        println("-----------postorder traversal ----------------")
        BSTTraversal.postOrderTraversal(four)
    }
}