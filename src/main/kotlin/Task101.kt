class Task101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) { return true }
        return isSubtreeSymmetric(root.left, root.right)
    }

    private fun isSubtreeSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }

        if (left?.`val` != right?.`val`) {
            return false
        }

        return isSubtreeSymmetric(left?.left, right?.right) && isSubtreeSymmetric(left?.right, right?.left)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}