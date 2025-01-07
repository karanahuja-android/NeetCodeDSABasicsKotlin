package test.Graph

import Graph.Dijkstra
import org.junit.jupiter.api.Test

class DijkstraTest {
    @Test
    fun dijkstraTest(){
        val adj = arrayOf(
            arrayOf(1 to 1, 2 to 6),
            arrayOf(2 to 3, 0 to 1),
            arrayOf(1 to 3,0 to 6))
        val totalVertices = 3
        val start = 2
        val answer = Dijkstra.dijkstra(adj,totalVertices,start)
        answer.forEach { println(it) }

    }
}