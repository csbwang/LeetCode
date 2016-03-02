#include<iostream>
#include<string>
using namespace std;
class Solution {
public:
 string convert(string s, int numRows) {
  if (s.size() == 0 || numRows == 1)return s;
  int numClos, a;
  int i, j, k, h = 0;
  bool end = false;
  if (numRows == 2)numClos = s.size() / 2 + 1;
  else
  {
   a = s.size() / (2 * numRows - 2);
   numClos = (a + 1)*(numRows - 1);
  }
  char **s_char = new char*[numRows + 1];
  for (i = 0; i < numRows + 1; i++)
  {
   s_char[i] = new char[numClos + 1];
  }
  for (i = 0; i < numRows + 1; i++)
  for (j = 0; j < numClos + 1; j++)
  {
   s_char[i][j] = '0';
  }
  j = 1;
  while (!end)
  {
   for (i = 1; i < numRows + 1; i++)
   {
    s_char[i][j] = s[h++];
    if (h >= s.size())
    {
     end = true;
     i = 2;
     break;
    }
   }
   i--;
   for (k = i - 1; k>1; k--)
   {
    s_char[k][i + j - k] = s[h++];
    if (h >= s.size())
    {
     end = true;
     break;
    }
   }
   j += numRows - 1;
  }
  string new_s = "";
  for (i = 0; i < numRows + 1; i++)
  for (j = 0; j < numClos + 1; j++)
  {
   if (s_char[i][j] != '0')
    new_s += s_char[i][j];
  }
  return new_s;
 }
};
void main()
{
 Solution *so = new Solution();
 string s="";
 cout << s.size();
 s = so->convert("PAYPALISHIRING", 1);
 cout << s;
 system("pause");
}