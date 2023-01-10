class Task347 {
    fun topKFrequent(nums: IntArray, k: Int): List<Int> {
        return nums
            .groupBy { it }
            .toList()
            .sortedByDescending { it.second.size }
            .take(k)
            .map { it.first }
    }
}