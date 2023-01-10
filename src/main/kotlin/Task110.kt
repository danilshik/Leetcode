class Task110 {
    private var result = true

    fun isBalanced(root: TreeNode?): Boolean {
        maxDepth(root)
        return result
    }

    fun maxDepth(root: TreeNode?): Int {
        if (root == null)
            return 0
        val l = maxDepth(root.left)
        val r = maxDepth(root.right)
        if (Math.abs(l - r) > 1)
            result = false
        return 1 + Math.max(l, r)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}