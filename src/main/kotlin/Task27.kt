class Task27 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var nums = nums
        var currentIndex = 0
        var n = nums.size
        while (currentIndex < n ){
            if(nums[currentIndex] == `val`){
                nums[currentIndex] = nums[n - 1]
                n--
            } else {
                currentIndex++
            }

        }
        return n
    }
}