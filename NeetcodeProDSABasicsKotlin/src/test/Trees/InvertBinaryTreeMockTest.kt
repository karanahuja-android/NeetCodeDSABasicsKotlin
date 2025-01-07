package test.Trees

import Trees.InvertBinaryTreeMock
import Trees.TreeNode
import org.junit.jupiter.api.Test

class InvertBinaryTreeMockTest {
    @Test
    fun invertBinaryTreeMockTest() {
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
        InvertBinaryTreeMock.invertBinaryTree(four)
    }
}