package main.kotlin

class Task33 {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] > target) {
                // левая половина монотонна, но все еще не удовлетворяет
                if (nums[left] <= nums[mid] && nums[left] > target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            } else {
                // правая половина монотонна, но все еще не удовлетворяет
                if (nums[right] >= nums[mid] && nums[right] < target) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }
        }
        return -1
    }
}