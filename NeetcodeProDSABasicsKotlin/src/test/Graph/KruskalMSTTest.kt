package test.Graph

import Graph.KruskalMST
import org.junit.jupiter.api.Test

class KruskalMSTTest {
    @Test
    fun createMSTTest(){
        val edges = listOf(
            Edge(1,4,1),
            Edge(1,2,2),
            Edge(2,4,3),
            Edge(5,4,9),
            Edge(5,1,4),
            Edge(2,3,3),
            Edge(3,4,5),
            Edge(2,6,7),
            Edge(3,6,8),
        )
        val result = KruskalMST.createMST(edges)
    }
}