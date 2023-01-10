class Task763 {
    fun partitionLabels(s: String): List<Int>? {
        val map: MutableMap<Char, Int> = HashMap()
        // filling impact of character's
        for (i in s.indices) {
            val ch = s[i]
            map[ch] = i
        }
        // making of result
        val res: MutableList<Int> = mutableListOf()
        var prev = -1
        var max = 0
        for (i in s.indices) {
            val ch = s[i]
            max = Math.max(max, map[ch]!!)
            if (max == i) {
                // partition time
                res.add(max - prev)
                prev = max
            }
        }
        return res
    }
}