package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var s1 = "" // []
        var s2 = "" // <>
        var s3 = "" // ()
        var al = arrayListOf<String>()

        inputString.forEachIndexed{i, ch ->

            if (ch == '['){
                s1 = inputString.substring(i+1)
                s1 = s1.substring(0, findLastIndex(s1, ch, ']'))
                println(s1)
                al.add(s1)
            }

            if (ch == '('){
                s2 = inputString.substring(i+1)
                s2 = s2.substring(0, findLastIndex(s2, ch, ')'))

                println(s2)
                al.add(s2)
            }

            if (ch == '<'){
                s3 = inputString.substring(i+1)
                s3 = s3.substring(0, findLastIndex(s3, ch, '>'))
                println(s3)
                al.add(s3)
            }
        }


        return al.toTypedArray()
    }

    fun findLastIndex(s: String, startChar: Char, lastChar: Char) : Int{
        var cCounter = 0

        for (j in s.indices) {
            if (s[j] == startChar) cCounter++
            if (s[j] == lastChar) {
                if (cCounter == 0) return j
                else cCounter--
            }
        }
        return -1
    }
}
