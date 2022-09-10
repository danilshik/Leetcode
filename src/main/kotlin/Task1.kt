class Task1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //Key - digit, value - index
        val cache = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, digit ->
            val searchDigit = target - digit
            if(cache.containsKey(searchDigit)){
                val cacheIndex = cache[searchDigit]!!
                return intArrayOf(cacheIndex, index)
            } else
                cache[digit] = index
        }
        return intArrayOf()
    }
}