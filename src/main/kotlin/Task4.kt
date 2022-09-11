
import java.util.*


class Task4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val medianLocation = (nums1.size + nums2.size) / 2
        val stack = Stack<Int>()
        var i = 0
        var j = 0
        while (stack.size <= medianLocation) {
            if (getValue(nums1, i) < getValue(nums2, j)) stack.push(nums1[i++]) else stack.push(nums2[j++])
        }
        val median = stack.pop()
        return if ((nums1.size + nums2.size) % 2 == 0) {
            (median + stack.pop()).toDouble() / 2
        } else median.toDouble()
    }

    fun getValue(array: IntArray, position: Int): Int {
        return if (position >= array.size) Int.MAX_VALUE else array[position]
    }
}