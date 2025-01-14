package Trees

class InvertBinaryTreeMock {
    companion object{
        fun invertBinaryTree(root:TreeNode?){
            if(root == null)
                return
            println(root?.value)
            val temp = root?.left
            root?.left = root?.right
            root?.right = temp
            invertBinaryTree(root?.left)
            invertBinaryTree(root?.right)
        }
//        fun invertBinaryTree(root:TreeNode?){
//            val currentLevelQueue = ArrayDeque<TreeNode>()
//            root?.let{currentLevelQueue.add(it)}
//            while(currentLevelQueue.isNotEmpty()){
//                for(i in 0 until currentLevelQueue.size){
//                    val currentNode = currentLevelQueue.removeFirst()
//                    val temp = currentNode.left
//                    currentNode.left = currentNode.right
//                    currentNode.right = temp
//                    println(currentNode.`val`)
//                    currentNode.left?.let{currentLevelQueue.add(it)}
//                    currentNode.right?.let{currentLevelQueue.add(it)}
//                }
//            }
//
//        }
    }
}