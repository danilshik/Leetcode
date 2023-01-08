package main.kotlin

class Task438 {
    fun findAnagrams(s: String, p: String): List<Int> {
        val anagrams = mutableListOf<Int>()

        if (s.length < p.length)
            return listOf<Int>()

        val pFreq = p.groupingBy { it }.eachCount()

        val window = mutableMapOf<Char, Int>()

        // initialize the window
        for (i in p.indices) {
            val current = window.getOrDefault(s[i], 0)
            window[s[i]] = current + 1
        }

        println(pFreq.entries)
        println(window.entries)

        for (i in p.length until s.length) {
            if (window == pFreq) {
                anagrams.add(i - p.length)
            }

            // remove the first element from the window
            if (window[s[i - p.length]]!! > 1) {
                window[s[i - p.length]] = window[s[i - p.length]]!! - 1
            } else {
                window.remove(s[i - p.length])
            }

            val current = window.getOrDefault(s[i], 0)
            window[s[i]] = current + 1
        }

        if (window == pFreq) {
            anagrams.add(s.length - p.length)
        }

        return anagrams
    }

}