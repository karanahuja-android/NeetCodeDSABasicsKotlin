package test.Trees

import Trees.BSTSearch
import Trees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BSTSearchTest {
    @Test
    fun bstSearch(){
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
        Assertions.assertEquals(BSTSearch.search(four,7),true)
        Assertions.assertEquals(BSTSearch.search(four,77),false)
    }
}