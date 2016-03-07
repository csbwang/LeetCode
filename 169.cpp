int majorityElement(vector<int>& nums) {
  int len = nums.size();
  if (len == 1)return nums[0]; 
  map<int, int>number;
  for (int i = 0; i < len; i++)
  {
       number[nums[i]]++;
  }
  map<int, int>::iterator it;
  int majority;
  for (it = number.begin(); it != number.end(); it++)
  {
   if (it->second>len / 2)
   {
       return it->first;
   }
  }
  }