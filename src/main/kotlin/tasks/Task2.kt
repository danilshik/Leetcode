package tasks

object Task2: BaseTask() {
    /**
     * Example
     * l1 = [2, 4, 5, 6]
     * l2 = [1, 5, 6, 0, 5, 6]
     * result = 6542 + 650651 = 657193
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var firstItem = l1
        var secondItem = l2
        var result: ListNode? = null
        var root: ListNode = ListNode(0)
        var divDigit = 0
        while(firstItem != null || secondItem != null){
            //Если больше 9 то равен 1
            val sum = (firstItem?.`val`?: 0) + (secondItem?.`val`?: 0) + divDigit
            val modDigit = sum.mod(10)
            divDigit = sum.div(10)
            firstItem = firstItem?.next
            secondItem = secondItem?.next
            if(result == null) {
                result = ListNode(modDigit)
                root = result
            }
            else {
                result.next = ListNode((modDigit))
                result = result.next
            }
        }
        if(divDigit == 1) {
            result?.next = ListNode(1)
            result = result?.next
        }

        return root
    }

    fun createListNode(text: String): ListNode? {
        var result: ListNode? = null
        text.reversed().forEach {
            if (result == null)
                result = ListNode(it.toString().toInt())
            else {
                result = ListNode(it.toString().toInt()).apply { next = result }

            }
        }
        return result
    }

    fun ListNode?.toStringNode(): String{
        var result = this
        val builder = StringBuilder()
        while(result?.`val` != null){
            builder.append(result.`val`)
            result = result.next
        }
        return builder.toString()
    }

    fun ListNode?.println(){
        println(this.toString())
    }


    override fun test(result: Any?, expected: Any?) {
        println("Result ${(result as ListNode?)?.toStringNode()}")
        println("Expected ${(expected as ListNode?)?.toStringNode()}")
        println("Equals ${result.toStringNode() == expected.toStringNode()}")
    }


    override fun tests(){
        test(addTwoNumbers(createListNode("243"), createListNode("564")), createListNode("708"))
        test(addTwoNumbers(createListNode("0"), createListNode("0")), createListNode("0"))
        test(addTwoNumbers(createListNode("9999999"), createListNode("9999")), createListNode("89990001"))
//        println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
//        println(twoSum(intArrayOf(3, 2, 4), 6).contentEquals(intArrayOf(1, 2)))
//        println(twoSum(intArrayOf(3, 3), 6).contentEquals(intArrayOf(0, 1)))
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }


    /**
     * Recursion
     *
     */
    fun ListNode?.value() = this?.`val` ?: 0

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
        if (l1 == null && l2 == null && carry == 0) return null
        val s = l1.value() + l2.value() + carry
        return ListNode(s % 10).apply { next = addTwoNumbers(l1?.next, l2?.next, s / 10) }
    }
}




