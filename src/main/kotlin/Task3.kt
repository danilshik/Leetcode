import jdk.internal.org.jline.utils.Colors


class Task3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var startIndex = 0
        var currIndex = 0
        var max = 0
        val set: MutableSet<Char> = HashSet()

        while (currIndex < s.length) {
            if (!set.contains(s[currIndex])) {
                set.add(s[currIndex++])
                max = Math.max(max, set.size)
            } else {
                set.remove(s[startIndex++])
            }
        }

        return max
    }
}