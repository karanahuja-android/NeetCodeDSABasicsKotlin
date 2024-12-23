package Graph

class BFS {
    companion object{
        fun bfs(adjMatrix:Array<IntArray>, firstVertice:Int, totalVertices:Int){
            val visited = IntArray(totalVertices){0}
            println("----- $firstVertice ------")
            val visitedQueue = ArrayDeque<Int>()
            visitedQueue.add(firstVertice)
            visited[firstVertice] = 1
            while(visitedQueue.isNotEmpty()){
                val curr = visitedQueue.removeFirst()
                for(j in 1 until totalVertices){
                    if(adjMatrix[curr][j] == 1 && visited[j] == 0)
                    {
                        println("------- $j -------")
                        visitedQueue.add(j)
                        visited[j] = 1
                    }
                }
            }
        }

    }

}