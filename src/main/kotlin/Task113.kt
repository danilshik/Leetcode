import java.util.*


class Task113 {
    private val resultList: MutableList<List<Int>> = ArrayList()

    fun pathSumInner(root: TreeNode?, sum: Int, path: Stack<Int>) {
        path.push(root!!.`val`)
        if (root.left == null && root.right == null)
            if (sum == root.`val`)
                resultList.add(ArrayList(path))
        if (root.left != null)
            pathSumInner(root.left, sum - root.`val`, path)
        if (root.right != null)
            pathSumInner(root.right, sum - root.`val`, path)
        path.pop()
    }

    fun pathSum(root: TreeNode?, sum: Int): List<List<Int>>? {
        if (root == null) return resultList
        val path = Stack<Int>()
        pathSumInner(root, sum, path)
        return resultList
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}