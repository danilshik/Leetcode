package main.kotlin

class Task81 {
    fun search(nums: IntArray, target: Int): Boolean {
        var left = 0
        var right = nums.size -1

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (nums[mid] == target) return true

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                // обработка cases
                // 1,0,1,1,1
                // 1,1,1,0,1
                left++
                right--
                continue
            }

            if (nums[left] <= nums[mid]) {
                // слева отсортировано
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                //справа отсортировано
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return false
    }
}