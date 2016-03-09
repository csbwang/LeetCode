class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int len = digits.size();
        for (int i = len-1; i > -1; i--)
        {
           digits[i]+=1;
           if (digits[i] == 10)digits[i] = 0;
           else return digits;
        }
          digits.insert(digits.begin(), 1);
          return digits;
    }
};