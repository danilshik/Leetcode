
import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.indices


class Task239 {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        var i = 0
        var j = 0

        val maxQueue: Deque<Int> = LinkedList<Int>()
        val result = mutableListOf<Int>()

        while (j < nums.size) {
            while (maxQueue.isNotEmpty() && nums[j] > maxQueue.last()) {
                maxQueue.pollLast()
                //получение и удаление
            }
            maxQueue.offerLast(nums[j])

            if (j - i + 1 == k) {
                result.add(maxQueue.first())
                if (maxQueue.first() == nums[i]) {
                    maxQueue.pollFirst()
                }
                i++
            }
            j++
        }

        return result.toIntArray()
    }
}