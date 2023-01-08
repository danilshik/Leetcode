package main.kotlin

class Task704 {

    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex
        while (left <= right){
            var middle = left + (right - left) / 2
            if(nums[middle] == target) return middle
            else if(nums[middle] > target) right = middle - 1
            else if(nums[middle] < target) left = middle + 1
        }
        return -1
    }
}