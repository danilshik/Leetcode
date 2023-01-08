package main.kotlin

class Task206 {

    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr : ListNode? = head
        while (curr != null){
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }

    class ListNode(var `val`: Int){
        var next : ListNode? = null
    }
}