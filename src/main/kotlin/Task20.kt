import java.util.*

class Task20 {
    fun isValid(s: String): Boolean {
        val stack = Stack<String>()
        for(i in 0..s.lastIndex) {
            val curr = s[i].toString()
            if (stack.isEmpty())
                stack.push(curr)
            else {
                when (curr) {
                    ")" -> {
                        if (stack.peek() == "(") {
                            stack.pop()
                        } else
                            return false
                    }
                    "}" -> {
                        if (stack.peek() == "{") {
                            stack.pop()
                        } else
                            return false
                    }
                    "]" -> {
                        if (stack.peek() == "[") {
                            stack.pop()
                        } else
                            return false
                    }
                    else -> stack.push(curr)
                }
            }
        }
        return stack.isEmpty()
    }
}