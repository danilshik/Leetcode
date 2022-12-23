class Task12 {
    fun intToRoman(num: Int): String {
        val builder = StringBuilder()
        var digit = num
        var countDigit = 1
        while(digit > 0){
            val number = digit.mod(Math.pow(10.0, countDigit.toDouble()).toInt())
            digit -= number
            val searchText = getStringForNumber(number)
            builder.insert(0, searchText)
            countDigit++
        }
        return builder.toString()

    }
    fun getStringForNumber(num: Int) : String{
        var digit = num
        val builder = StringBuilder()
        while(digit > 0) {
            when {
                digit >= 1000 -> {
                    builder.append("M")
                    digit -= 1000
                }
                digit >= 900 -> {
                    builder.append("CM")
                    digit -= 900
                }
                digit >= 500 -> {
                    builder.append("D")
                    digit -= 500
                }
                digit >= 400 -> {
                    builder.append("CD")
                    digit =- 400
                }
                digit >= 100 -> {
                    builder.append("C")
                    digit-= 100
                }
                digit >= 90 -> {
                    builder.append("XC")
                    digit -= 90
                }
                digit >= 50 -> {
                    builder.append("L")
                    digit -= 50
                }
                digit >= 40 -> {
                    builder.append("XL")
                    digit -= 40
                }
                digit >= 10 -> {
                    builder.append("X")
                    digit-= 10
                }
                digit >= 9 -> {
                    builder.append("IX")
                    digit -= 9
                }
                digit >= 5 -> {
                    builder.append("V")
                    digit -=5
                }
                digit >= 4 -> {
                    builder.append("IV")
                    digit -=4
                }
                digit >= 1 -> {
                    builder.append("I")
                    digit -=1
                }
            }
        }
        return builder.toString()
    }
}