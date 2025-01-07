package test.Graph

import Graph.SegmentTree
import org.junit.jupiter.api.Test

class SegmentTreeTest {
    @Test
    fun buildTreeTest(){
        SegmentTree.input = intArrayOf(1,2,3,4,8,3)
        SegmentTree.buildTree(0,0,5)
        SegmentTree.segmentTree.forEach {
            println(it)
        }
        println(SegmentTree.query(0,0,5,0,3))
    }

}