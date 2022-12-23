class Task34 {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var start = 0
        var end = nums.lastIndex
        var result = intArrayOf(-1, -1)
        var isFound = false
        while(start <= end) {
            var middle = start + (end - start) / 2
            if (nums[middle] < target) {
                end = middle - 1
            } else if(nums[middle] > target){
                start = middle + 1
            } else {
                isFound = true
            }
        }
        if(!isFound)
            return result
        while(start >= 0 && end < nums.lastIndex){
            if((start - 1) >= 0 && nums[start - 1] == target){
                start--
            } else if((end + 1 <= nums.lastIndex) && nums[end + 1] == target){
                end++
            } else {
                return intArrayOf(start, end)
            }
        }
        return result

    }
}