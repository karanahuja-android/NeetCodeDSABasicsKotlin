package Graph

import java.util.PriorityQueue

class Prims {
    companion object{
        fun spanningTree(totalVertices:Int, adj: Array<MutableList<Pair<Int, Int>>>):Int{
            val pq = PriorityQueue(compareBy<Pair<Int,Int>>{it.first})
            val visited = BooleanArray(totalVertices)
            pq.add(0 to 0)
            var totalWeight = 0
            while(pq.isNotEmpty()){
                val (weight,node) = pq.poll()
                if(visited[node]) continue
                visited[node] = true
                totalWeight += weight
                println("node is $node")
                for((adjNode,edgeWeight) in adj[node]){
                    if(!visited[adjNode]){
                        pq.add(edgeWeight to adjNode)
                    }
                }
            }
            println("total weight is $totalWeight")
            return totalWeight
        }
    }

}