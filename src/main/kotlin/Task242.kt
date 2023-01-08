package main.kotlin

class Task242 {
    fun isAnagram(s: String, t: String): Boolean {
        val freqMap = hashMapOf<Char, Int>()
        s.forEach { freqMap[it] = freqMap.getOrDefault(it, 0) + 1 }
        t.forEach { freqMap[it] = freqMap.getOrDefault(it, 0) - 1 }
        return freqMap.filter { it.value != 0 }
            .isEmpty()
    }
}