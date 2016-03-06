#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
 int removeElement(vector<int>& nums, int val) {
  int len = nums.size(), i;
  for (i = 0; i < nums.size();)
  {
   if (nums[i] == val)
   {
    nums.erase(nums.begin() + i);
    continue;
   }
   i++;
  }
  return nums.size();
 }
};
void main()
{
 vector<int> nums = {4,5,4,5,6,7,8,4,5};
 int val = 4;
 Solution *s = new Solution();
 int ss = s->removeElement(nums, val);
 system("pause");
}