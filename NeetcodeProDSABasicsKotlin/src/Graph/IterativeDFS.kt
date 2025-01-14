package Graph

import Trees.TreeNode

class IterativeDFS {
    companion object{
        fun inorderTraversal(root: TreeNode?):List<Int>{
            val stack = ArrayDeque<TreeNode>()
            val inOrder = mutableListOf<Int>()
            var current = root
            while(current != null || stack.isNotEmpty()){
                if(current != null){
                    stack.addFirst(current)
                    current = current.left
                }
                else{
                    current = stack.removeFirst()
                    inOrder.add(current.value)
                    current = current.right
                }

            }
            return inOrder
        }
    }

}