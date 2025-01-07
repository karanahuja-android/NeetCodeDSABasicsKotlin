package Graph

class DFS {
    companion object{
        val visited = IntArray(7){0}
        fun dfs(adjMatrix:Array<IntArray>,curr:Int,totalVertices:Int){

            if(visited[curr] == 0) {
                println("----- $curr ----- ")
                visited[curr] = 1

                for (j in 1 until totalVertices) {
                    if (adjMatrix[curr][j] == 1 && visited[j] == 0) {
                        dfs(adjMatrix, j, totalVertices)
                    }
                }
            }

        }
    }
}