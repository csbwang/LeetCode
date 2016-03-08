class Solution {
public:
int removeDuplicates(vector<int>& nums) {
  int len = nums.size();
  if (len == 0 || len == 1)return len;
  int index = 0;
  for (int i = 1; i < len; i++)
  {
       while (i < len && nums[i] == nums[index])
       {
            i++;
       }
       if (i != len)nums[++index] = nums[i];
  }
      nums.erase(nums.begin() + index+1, nums.end());
      return nums.size();
  }
};
