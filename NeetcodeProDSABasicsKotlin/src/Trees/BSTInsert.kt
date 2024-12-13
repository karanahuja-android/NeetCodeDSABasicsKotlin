package Trees

class BSTInsert {
    companion object{
        fun insert(root:TreeNode?,insertValue:Int):TreeNode?{
            when{
                root == null -> return TreeNode(insertValue)
                insertValue > root.`val` -> root.right = insert(root.right,insertValue)
                insertValue < root.`val` -> root.left = insert(root.left,insertValue)
            }
            return root

        }
    }
}