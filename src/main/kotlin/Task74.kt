package main.kotlin

class Task74 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return false
        var countColumns = matrix[0].size
        var countNumbers = matrix.size * countColumns
        if (target < matrix.first().first() || target > matrix.last().last()) return false
        var left = 0
        var right = countNumbers - 1
        while (left <= right) {
            var middle = left + (right - left) / 2
            var row = middle / countColumns
            var col = middle % countColumns
            if (matrix[row][col] == target) {
                return true
            } else if (matrix[row][col] < target) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return false
    }

}