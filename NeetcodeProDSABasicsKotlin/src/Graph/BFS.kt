package Graph

class BFS {
    companion object{
        fun bfs(adjMatrix:Array<IntArray>, firstVertice:Int, totalVertices:Int){
            val visited = IntArray(7){0}
            val visitedDequeue = ArrayDeque<Int>()
            println("----- $firstVertice -----")
            visited[firstVertice] = 1
            visitedDequeue.add(firstVertice)
            while(visitedDequeue.isNotEmpty()){
                val curr = visitedDequeue.removeFirst()
                for(j in 1 until totalVertices){
                    if(adjMatrix[curr][j] == 1 && visited [j] == 0){
                        println("----- $j -----")
                        visited[j] = 1
                        visitedDequeue.add(j)
                    }
                }

            }
        }

    }

}