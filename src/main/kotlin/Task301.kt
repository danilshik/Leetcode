class Task301 {
    fun removeInvalidParentheses(s: String): List<String> {
        val ans = mutableListOf<String>()
        remove(s, ans, 0, 0, charArrayOf('(', ')'))
        return ans
    }

    fun remove(s: String, ans: MutableList<String>, last_i: Int, last_j: Int, par: CharArray) {
        var stack = 0
        var i = last_i
        while (i < s.length) {
            if (s[i] == par[0]) stack++
            if (s[i] == par[1]) stack--
            if (stack >= 0) {
                ++i
                continue
            }
            for (j in last_j..i) if (s[j] == par[1] && (j == last_j || s[j - 1] != par[1])) remove(
                s.substring(
                    0,
                    j
                ) + s.substring(j + 1, s.length), ans, i, j, par
            )
            return
            ++i
        }
        val reversed = StringBuilder(s).reverse().toString()
        if (par[0] == '(') // finished left to right
            remove(reversed, ans, 0, 0, charArrayOf(')', '(')) else  // finished right to left
            ans.add(reversed)
    }
}