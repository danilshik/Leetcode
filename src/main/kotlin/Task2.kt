/**
* Example:
* var li = ListNode(5)
* var v = li.`val`
* Definition for singly-linked list.
* class ListNode(var `val`: Int) {
    *     var next: ListNode? = null
    * }
*/


class Task2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var firstNode = l1
        var secondNode = l2

        var head = ListNode(-1)
        var temp = head

        var inMemory = 0
        while(firstNode != null || secondNode != null || inMemory > 0){
            var sum = 0
            if(firstNode != null){
                sum += firstNode.`val`
                firstNode = firstNode.next
            }
            if(secondNode != null){
                sum += secondNode.`val`
                secondNode = secondNode.next
            }
            sum += inMemory
            inMemory = sum.div(10)
            val node = ListNode(sum.mod(10))
            temp.next = node

            temp = temp.next!!

        }
        return head.next

    }

    class ListNode(var `val`: Int){
        var next : ListNode? = null
    }
}

