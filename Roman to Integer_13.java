public class Solution {
    public int roman2Int(char c)
    {
        switch(c)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int num = 0;
        int i;
        for(i = 0; i < s.length()-1; i++)
        {
            int cI = roman2Int(s.charAt(i)), nI = roman2Int(s.charAt(i + 1));
            if(cI < nI)
            {
                num += nI - cI;
                i++;
            }
            else
            {
                num += cI;
            }
        }
        if(i <  s.length())
        {
            num += roman2Int(s.charAt(i));
        }
        return num;
    }
}
