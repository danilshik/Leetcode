import kotlin.math.min

class Task14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        return longestCommonPrefix(strs, 0, strs.lastIndex)
    }

    fun longestCommonPrefix(strs : Array<String>, start: Int, end: Int): String{
        if(start == end)
            return strs[start]
        else {
            val middle = (start + end) / 2
            val commonPrefixLeft = longestCommonPrefix(strs, start, middle)
            val commonPrefixRight = longestCommonPrefix(strs, middle + 1, end)
            return commonPrefix(commonPrefixLeft, commonPrefixRight)
        }
    }

    fun commonPrefix(left: String, right: String): String{
        val min = Math.min(left.length, right.length)
        for(i in 0 until min){
            if(left[i] != right[i]){
                return left.substring(0, i)
            }
        }
        return left.substring(0, min)
    }
}