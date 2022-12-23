class Task21 {
//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//        var firstList = list1
//        var secondList = list2
//
//        var rootResult : ListNode = ListNode(0)
//
//
//        when {
//            firstList == null && secondList == null -> return null
//            firstList == null -> return secondList
//            secondList == null -> return firstList
//            firstList.`val` <= secondList.`val` -> {
//                rootResult = secondList
//                secondList = secondList.next
//            }
//            else -> {
//                rootResult = firstList
//                firstList = secondList.next
//            }
//        }
//        rootResult.next = mergeTwoLists(list1, list2)
//
//        return rootResult
//    }
//
//    class ListNode(var `val`: Int) {
//        var next: ListNode? = null
//    }

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