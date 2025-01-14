package Trees

class BSTSearch {
    companion object {
        fun search(root: TreeNode?, target: Int): Boolean {
            when {
                root == null -> return false
                target > root.value -> return search(root.right, target)
                target < root.value -> return search(root.left, target)
                else -> return true
            }
        }
    }
}