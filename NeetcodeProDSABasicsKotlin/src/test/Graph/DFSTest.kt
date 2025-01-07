package test.Graph

import Graph.BFS
import Graph.DFS
import org.junit.jupiter.api.Test

class DFSTest {
    @Test
    fun dfs(){
        val adjMatrix = arrayOf(
            intArrayOf(0,0,0,0,0,0,0),
            intArrayOf(0,0,1,1,0,0,0),
            intArrayOf(0,1,0,0,1,0,0),
            intArrayOf(0,1,0,0,1,0,0),
            intArrayOf(0,0,1,1,0,1,1),
            intArrayOf(0,0,0,0,1,0,0),
            intArrayOf(0,0,0,0,1,0,0)
        )
        DFS.dfs(adjMatrix,1,7)
    }
}