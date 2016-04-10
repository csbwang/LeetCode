public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1) return "";
        int tmp = 0;
        outer: while(tmp < strs[0].length())
        {
            for(int i = 0; i < strs.length; i++)
            {
                if(tmp >= strs[i].length()) break outer;
                if(strs[0].charAt(tmp) != strs[i].charAt(tmp))
                {
                    break outer;
                }
            }
            tmp++;
        }
        return strs[0].substring(0, tmp);
    }
}
