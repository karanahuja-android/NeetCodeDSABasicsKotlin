package Graph

import test.Graph.Edge

class KruskalMST {
    companion object{
        fun createMST(inputEdges:List<Edge>):List<Edge>{
            val outputEdges = mutableListOf<Edge>()
            val myDisjointSet = DisjointSet(6)
            val sortedInputEdges = inputEdges.sortedBy {it.weight}
            sortedInputEdges.forEach{
                val srcPar = myDisjointSet.getUltimateParent(it.src)
                val destPar = myDisjointSet.getUltimateParent(it.dest)
                if(srcPar != destPar)
                {
                    outputEdges.add(it)
                    myDisjointSet.unionByRank(srcPar,destPar)
                }
            }
            println(outputEdges)
            return outputEdges.toList()
        }
    }

}