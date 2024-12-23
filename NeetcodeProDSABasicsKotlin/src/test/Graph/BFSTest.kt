package test.Graph

import Graph.BFS
import org.junit.jupiter.api.Test

class BFSTest {
    @Test
    fun bfs(){
        val adjMatrix = arrayOf(
            intArrayOf(0,0,0,0,0,0,0),
            intArrayOf(0,0,1,1,0,0,0),
            intArrayOf(0,1,0,0,1,0,0),
            intArrayOf(0,1,0,0,1,0,0),
            intArrayOf(0,0,1,1,0,1,1),
            intArrayOf(0,0,0,0,1,0,0),
            intArrayOf(0,0,0,0,1,0,0)
        )
        BFS.bfs(adjMatrix,1,7)
    }
}