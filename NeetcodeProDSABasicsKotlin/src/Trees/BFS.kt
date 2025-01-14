package Trees

class BFS {
    companion object{
        fun bfs(root:TreeNode?){
            val currentRowQueue = ArrayDeque<TreeNode>()
            root?.let{currentRowQueue.add(it)}
            var level = 0
            while(currentRowQueue.isNotEmpty()){
                println("--- current level is $level --- ")
                val numNodes = currentRowQueue.size
                for (i in 0 until numNodes){
                    val currentNode = currentRowQueue.removeFirst()
                    println(currentNode.value)
                    currentNode.left?.let{currentRowQueue.add(it)}
                    currentNode.right?.let{currentRowQueue.add(it)}
                }
                level++
            }

        }

    }

}