import java.util.*
import java.util.function.Supplier


class Task480 {
    fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray? {
        val comparator = Comparator { a: Int, b: Int ->
            if (nums[a] != nums[b])
                nums[a].compareTo(nums[b])
            else a - b
        }
        val left = TreeSet(comparator.reversed())
        val right = TreeSet(comparator)
        val median = if (k % 2 == 0) Supplier {
            (nums[left.first()].toDouble() + nums[right.first()]) / 2
        } else Supplier { nums[right.first()].toDouble() }

        // balance lefts size and rights size (if not equal then right will be larger by one)
        val result = DoubleArray(nums.size - k + 1)
        for (i in 0 until k)
            left.add(i)
        while (left.size > right.size)
            right.add(left.pollFirst())
        result[0] = median.get()
        var i = k
        var r = 1
        while (i < nums.size) {

            // remove tail of window from either left or right
            if (!left.remove(i - k))
                right.remove(i - k)

            // add next num, this will always increase left size
            right.add(i)
            left.add(right.pollFirst())

            // rebalance left and right, then get median from them
            while (left.size > right.size)
                right.add(left.pollFirst())
            result[r] = median.get()
            i++
            r++
        }
        return result
    }
}