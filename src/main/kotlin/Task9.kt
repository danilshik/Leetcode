import java.util.*

class Task9 {
    fun isPalindrome(x: Int): Boolean {
        var digitPalindrome = 0
        var digit = x
        if(x < 0)
            return false
        while (digit > 0){
            digitPalindrome = digitPalindrome * 10 + digit.rem(10)
            digit = digit.div(10)
        }

        return digitPalindrome == x

    }
}