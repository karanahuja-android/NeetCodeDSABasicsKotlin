package test.Trees

import Trees.BFS
import Trees.TreeNode
import org.junit.jupiter.api.Test

class BFSTest {
    @Test
    fun bfsTest(){
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
        BFS.bfs(four)
    }
}