package Graph

class TopologicalSort {
    companion object{
        fun sort(totalVertices:Int,edges:Array<Pair<Int,Int>>):List<Int>{
            val adj = Array(totalVertices + 1){mutableListOf<Int>()}
            for(myEdge in edges){
                adj[myEdge.first].add(myEdge.second)
            }
            val visited = mutableSetOf<Int>()
            val sortedResult = mutableListOf<Int>()
            fun dfs(node:Int){
                if(node in visited)
                    return
                visited.add(node)
                for(neighbour in adj[node]){
                    dfs(neighbour)
                }
                sortedResult.add(node)
            }
            for(i in 1..totalVertices){
                dfs(i)
            }
            return sortedResult.reversed()
        }
    }
}