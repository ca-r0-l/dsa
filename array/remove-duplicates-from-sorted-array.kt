/* https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/ */

fun main() {
    val nums = intArrayOf(1, 1, 2)

    removeDuplicates(nums)
}

/* força bruta
fun removeDuplicates(nums: IntArray): Int {
    val l = mutableListOf<Int>()
    for (i: Int in nums) {
        if (l.contains(i)) continue else l.add(i)
    }

    nums.mapIndexed { index, i ->
        if (index < l.size) {
            nums.set(index, l[index])
        } else nums.set(index, -999)
    }

    nums.map { println(it) }

    return l.size
} */

/* melhor solução */
fun removeDuplicates(nums: IntArray): Int {
    var j = 1

    for (i in 1..nums.size -1) {
        if (nums[i] != nums[i -1]) {
            nums[j] = nums[i]
            j++
        }
    }

    return j
}
