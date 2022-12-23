class Task26 {
    fun removeDuplicates(nums: IntArray): Int {
        var nums = nums
        var insertIndex = 1
        for(i in 1..nums.lastIndex){
            if(nums[i -1] != nums[i]) {
                nums[insertIndex] = nums[i]
                insertIndex++
            }

        }
        return insertIndex
    }
}