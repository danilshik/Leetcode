class Task8 {
    fun myAtoi(s: String): Int {
        var text = s
        var isNegativeDigit = false
        text = text.trimStart()
        if(text.isEmpty())
            return 0
        if(text[0].toString() == "-" || text[0].toString() == "+") {
            if(text[0].toString() == "-")
                isNegativeDigit = true
            text = text.drop(1)
        }
        var positionDigit = -1
        for(item in text.withIndex()){
            if(item.value.isDigit()){
                positionDigit = item.index
            } else {
                break
            }
        }
        if(positionDigit == -1)
            return 0
        var number = 0
        val digit = text.substring(0, positionDigit + 1)
        try {
            number = digit.toInt()
            if(isNegativeDigit)
                number *= -1
        } catch (e: Exception){
            if(isNegativeDigit)
                number = Int.MIN_VALUE
            else
                number = Int.MAX_VALUE
        }

        return number

    }
}