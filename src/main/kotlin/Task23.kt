package main.kotlin

class Task23 {

    /**
     * Решение через 'разделяй и властвуй' слиянием отдельных участков.
     * Также можно решить, через очереди с приоритетом
     */
    fun mergeKLists(lists : Array<ListNode?>) : ListNode? {
        if(lists.isEmpty()) return null
        return lists.mergeBuild()
    }

    fun Array<ListNode?>.mergeBuild(startIndex : Int = 0, endIndex : Int = this.lastIndex) : ListNode?{
        if(startIndex == endIndex)
            return this[startIndex]
        val middle = startIndex + (endIndex - startIndex) / 2
        val leftPart = mergeBuild(startIndex, middle)
        val rightPart = mergeBuild(middle + 1, endIndex)
        return mergeTwoLists(leftPart, rightPart)
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var list1 = list1
        var list2 = list2
        var head = ListNode(0)
        if (list1 == null && list2 == null) return null
        if (list1 == null) return list2
        if (list2 == null) return list1
        if (list1.`val` > list2.`val`) {
            head = list2
            list2 = list2.next
        } else {
            head = list1
            list1 = list1.next
        }
        head.next = mergeTwoLists(list1, list2)
        return head
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}