package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val sum = input.sum()
        val min = input.min()
        val max = input.max()
        return intArrayOf(sum-max!!, sum-min!!)
    }
}
