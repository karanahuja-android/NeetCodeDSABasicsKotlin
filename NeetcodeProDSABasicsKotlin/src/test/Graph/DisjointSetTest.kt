package test.Graph

import Graph.DisjointSet
import org.junit.jupiter.api.Test

class DisjointSetTest {
    @Test
    fun testGetUltimateParent(){
        val myDisjointSet = DisjointSet(5)
        println(myDisjointSet.rank)
        println(myDisjointSet.parent)
        myDisjointSet.parent[1] = 1
        myDisjointSet.parent[2] = 1
        myDisjointSet.parent[3] = 1
        myDisjointSet.parent[4] = 1
        myDisjointSet.parent[5] = 2
        println(myDisjointSet.parent)
        println(myDisjointSet.getUltimateParent(5))
    }

    @Test
    fun testUnion(){
        val myDisjointSet = DisjointSet(5)
        myDisjointSet.unionByRank(1,2)
        myDisjointSet.unionByRank(1,3)
        myDisjointSet.unionByRank(1,4)
        myDisjointSet.unionByRank(2,5)
        println(myDisjointSet.parent)

    }
    @Test
    fun testUnionNew(){
        val myDisjointSet = DisjointSet(7)
        myDisjointSet.unionByRank(1, 2)
        myDisjointSet.unionByRank(2, 3)
        myDisjointSet.unionByRank(4, 5)
        myDisjointSet.unionByRank(6, 7)
        myDisjointSet.unionByRank(5, 6)
        println(myDisjointSet.parent)
        myDisjointSet.unionByRank(3, 7)
        myDisjointSet.getUltimateParent(3)
        myDisjointSet.getUltimateParent(2)
        println(myDisjointSet.parent)

    }

}