package Trees

class BSTSearch {
    companion object {
        fun search(root: TreeNode?, target: Int): Boolean {
            when {
                root == null -> return false
                target > root.`val` -> return search(root.right, target)
                target < root.`val` -> return search(root.left, target)
                else -> return true
            }
        }
    }
}