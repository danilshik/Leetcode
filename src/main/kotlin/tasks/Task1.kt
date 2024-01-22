package tasks

object Task1: BaseTask() {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //Value, index
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, value ->
            val searchValue = target - value
            map[searchValue]?.let { return intArrayOf(it, index) }
            map[value] = index
        }
        return intArrayOf()
    }

    override fun tests(){
        println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
        println(twoSum(intArrayOf(3, 2, 4), 6).contentEquals(intArrayOf(1, 2)))
        println(twoSum(intArrayOf(3, 3), 6).contentEquals(intArrayOf(0, 1)))
    }
}
