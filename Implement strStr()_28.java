public class Solution {
    public int strStr(String haystack, String needle) {
        int nLen =  needle.length();
        if(nLen == 0)return 0;
        int hLen = haystack.length();
        char[] nChars = needle.toCharArray();
        char[] hChars = haystack.toCharArray();
        int i, j;
        for(i = 0; i < hLen; i++)
        {
            if(nChars[0] == hChars[i])
            {
                if(nLen > hLen - i) return -1; //注意这点，否则可能会浪费很多时间复杂度
                j = 0;
                while((j < nLen) && (nChars[j] == hChars[i + j]))
                {
                    j++;
                }
                if(j == nLen)return i;
            }
        }
        return -1;
    }
}
