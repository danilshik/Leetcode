package main.kotlin

class Task153 {
    fun findMin(nums: IntArray): Int {
        val n = nums.size
        if(n == 1) return nums[0]
        var low = 0
        var high = n - 1
        var min = Integer.MIN_VALUE
        while(low < high) {
            var middle = low + (high - low)/2
            if(nums[middle] < nums[high]) {
                high = middle
            } else {
                low = middle + 1
            }
            min = nums[low]
        }
        return min
    }
}