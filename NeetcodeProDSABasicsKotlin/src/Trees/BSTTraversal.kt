package Trees

class BSTTraversal {
    companion object{
        fun inOrderTraversalOutput(root:TreeNode?):MutableList<Int>{
            val outputList = mutableListOf<Int>()
            fun traverse(root: TreeNode?){
                if(root == null)
                    return
                traverse(root.left)
                outputList.add(root.`val`)
                traverse(root.right)
            }
            traverse(root)
            return outputList
        }
        fun inOrderTraversal(root:TreeNode?){
            if(root == null)
                return
            inOrderTraversal(root.left)
            println(root.`val`)
            inOrderTraversal(root.right)

        }

        fun preOrderTraversal(root:TreeNode?){
            if(root == null)
                return
            println(root.`val`)
            preOrderTraversal(root.left)
            preOrderTraversal(root.right)
        }

        fun postOrderTraversal(root:TreeNode?){
            if(root == null)
                return
            postOrderTraversal(root.left)
            postOrderTraversal(root.right)
            println(root.`val`)
        }
    }

}