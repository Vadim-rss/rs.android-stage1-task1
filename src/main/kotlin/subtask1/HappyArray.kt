package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        var mlist = sadArray.toMutableList()

        if(mlist.size < 2){
            return sadArray
        }

        var isListHappy: Boolean = false
        while (!isListHappy) {
            isListHappy = true
            for (i in 1 until mlist.size-1){

                if (!checkIsHappy(mlist.get(i-1), mlist.get(i), mlist.get(i+1) ) ){
                    mlist.removeAt(i)
                    isListHappy = false
                    break
                }

            }

        }

        return mlist.toIntArray()
    }

    private fun checkIsHappy(lElem: Int, cElem: Int, rElem: Int): Boolean {
        return lElem + rElem > cElem
    }
}
