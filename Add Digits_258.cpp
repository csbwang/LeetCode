public class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        int a = num % 9;
        if(a == 0)
            return 9;
        else
            return a;
    }
}
