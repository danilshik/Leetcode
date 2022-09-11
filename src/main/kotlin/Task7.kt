class Task7 {
    fun reverse(x: Int): Int {
        var isNegativeDigit = false
        var result = 0
        var digit = x
        var countDigit = 0
        if(x < 0) {
            isNegativeDigit = true
            digit*= -1
        }
        while(digit > 0){
            if(result == 0){
                result = digit.rem(10)
            } else {
                if(Int.MAX_VALUE / 10 < result)
                    return 0
                else
                    result = result * 10 + digit.rem(10)
            }
            countDigit++
            digit /= 10
        }
        if(isNegativeDigit)
            result *= -1
        return result

    }
}