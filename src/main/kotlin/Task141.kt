package main.kotlin

class Task141 {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast != null) {
            if (fast.next == slow) {
                return true
            }
            slow = slow?.next
            fast = fast.next?.next
        }

        return false
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}