package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var s: Int = 0
        var i: Int = 0
        var k1: Int = k
        val a = digitString.toCharArray()
        while(i<n/2)
        {
            if(digitString[i]!=digitString[n-i-1])
                s++
            i++
        }
        if (s > k1)
            return "-1"
        i=0
        do
        {
            if (s == k1)
                while (i < n / 2)
                {
                    if (digitString[i] != digitString[n - i - 1])
                    {
                        if (digitString[i] > digitString[n - i - 1])
                        {
                            a[n - i - 1] = digitString[i]
                            k1--
                            s--
                        } else
                        {
                            a[i] = digitString[n - i - 1]
                            k1--
                            s--
                        }
                    }
                    i++
                }
            else if(s<k1)
            {
                a[i] = '9'
                a[n - i - 1] = '9'
                k1-=2
                s--
                i++
            }
        }while(k1!=0 && s!=0)
        return String(a)
    }
}
