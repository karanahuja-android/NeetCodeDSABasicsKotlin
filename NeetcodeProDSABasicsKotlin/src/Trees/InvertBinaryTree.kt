package Trees

class InvertBinaryTree {
    companion object {
        fun invert(root:TreeNode?){
            val currentLevelQueue = ArrayDeque<TreeNode>()
            root?.let{currentLevelQueue.add(it)}
            while(currentLevelQueue.isNotEmpty()){
                for(i in 0 until currentLevelQueue.size){
                    val curr = currentLevelQueue.removeFirst()
                    val temp = curr.left
                    curr.left = curr.right
                    curr.right = temp
                    println(curr.`val`)
                    curr.left?.let{currentLevelQueue.add(it)}
                    curr.right?.let{currentLevelQueue.add(it)}
                }

            }

        }
    }
}