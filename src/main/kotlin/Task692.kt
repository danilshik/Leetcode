import java.util.*


class Task692 {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = HashMap<String, Int>()
        val pq = PriorityQueue<String> { a, b ->
            if((map[b]!! == map[a]!!)) {
                a.compareTo(b)
            } else {
                map[b]!! - map[a]!!
            }
        }
        val result = mutableListOf<String>()
        var k = k

        words.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        map.forEach { key, value ->
            pq.offer(key)
        }

        while(k > 0) {
            result.add(pq.poll())
            k--
        }

        return result
    }
}