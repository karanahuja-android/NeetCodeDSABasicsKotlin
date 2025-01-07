package test.Graph

import Graph.TopologicalSort
import org.junit.jupiter.api.Test

class TopologicalSortTest {
    @Test
    fun sortTest(){
        val edges = arrayOf(
            1 to 2,
            1 to 3,
            3 to 4,
            2 to 4,
            4 to 5
        )
        val sortedResult = TopologicalSort.sort(5,edges)
        println(sortedResult)
    }
}