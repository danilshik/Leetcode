import java.util.*


class Task15 {
//    fun threeSum(nums: IntArray): List<List<Int>> {
//        val i = 0
//        nums.sort()
//        val result = hashSetOf<List<Int>>()
//        for(i in 0..nums.size - 3){
//            for(j in (i + 1)..nums.size - 2){
//                for(k in (j + 1)..nums.size - 1)
//                if(nums[i] + nums[j] + nums[k] == 0)
//                    result.add(listOf(nums[i], nums[j], nums[k]))
//                else if(nums[i] + nums[j] + nums[k] > 0)
//                    break
//            }
//
//
//        }
//        return result.toList()
//    }

    fun threeSum(nums: IntArray): List<List<Int>>? {
        Arrays.sort(nums)
        val triplets = ArrayList<List<Int>>()
        val n = nums.size
        var i = 0
        while (i < n - 2) {
            if (i != 0) while (i < n && nums[i] == nums[i - 1]) i++
            // if the smallest number is positive, all numbers of triplet will be positive, which can't sum to 0
            if (i < n && nums[i] > 0) break
            var j = i + 1
            var k = n - 1
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                if (sum == 0) {
                    triplets.add(listOf(nums[i], nums[j++], nums[k--]))
                    while (j < k && nums[j] == nums[j - 1]) j++
                    while (j < k && nums[k] == nums[k + 1]) k--
                } else if (sum < 0) { // sum too low, increase it
                    j++
                } else { // sum too high, decrease it
                    k--
                }
            }
            i++
        }
        return triplets
    }
}