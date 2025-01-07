package test.Graph

import Graph.Prims
import org.junit.jupiter.api.Test

class PrimsTest {
    @Test
    fun testPrims(){
        val totalVertices = 5
        val edges = listOf(
            Triple(0, 1, 2), Triple(0, 2, 1), Triple(1, 2, 1),
            Triple(2, 3, 2), Triple(3, 4, 1), Triple(4, 2, 2)
        )
        val adj = Array(totalVertices){ mutableListOf<Pair<Int,Int>>() }
        for((u,v,w) in edges){
            adj[u].add(v to w)
            adj[v].add(u to w)
        }
        Prims.spanningTree(totalVertices,adj)
    }




}