package test.Trees
import Trees.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
class TreeNodeTest {
    @Test
    fun treeNodeCreationTest(){
        val tRoot = TreeNode(4)
        var tLeft = TreeNode(3)
        var tRight = TreeNode(6)
        tRoot.left = tLeft
        tRoot.right = tRight
        Assertions.assertEquals(tRoot.value,4)
        Assertions.assertEquals(tRoot.left!!.value,3)
        Assertions.assertEquals(tRoot.right!!.value,6)
    }
}