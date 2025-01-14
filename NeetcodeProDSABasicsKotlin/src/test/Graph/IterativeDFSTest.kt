package test.Graph

import Graph.IterativeDFS
import Trees.TreeNode
import org.junit.jupiter.api.Test

class IterativeDFSTest {
    @Test
    fun inOrderTest(){
        val one = TreeNode(1)
        val two = TreeNode(2)
        val three = TreeNode(3)
        val four = TreeNode(4)
        val five = TreeNode(5)
        one.left = two
        one.right = three
        two.left = four
        two.right = five
        val result = IterativeDFS.inorderTraversal(one)
        println(result)
    }
}