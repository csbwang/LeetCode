#include<iostream>
#include<string>
#include<vector>
using namespace std;

struct ListNode {
 int val;
 ListNode *next;
 ListNode(int x) : val(x), next(NULL) {}
};
class Solution {
public:
 ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
  ListNode* head = NULL;
  ListNode* p = NULL;
  int a,b = 0,c,l1_val,l2_val,i=0;
  while (l1 != NULL || l2 != NULL)
  {
   if (l1 != NULL)
   {
    l1_val = l1->val;
    l1 = l1->next;
   }
   else
   {
    l1_val = 0;
   }
   if (l2 != NULL)
   {
    l2_val = l2->val;
    l2 = l2->next;
   }
   else
   {
    l2_val = 0;
   }
   a = c = (l1_val + l2_val + b);
   b = 0;
   if (c > 9)
   {
    a = c % 10;
    b = 1;
   }
   if (i == 0)
   {
    head = p = new ListNode(a);
    i = 1;
   }
   else
   {
    p->next = new ListNode(a);
    p = p->next;
   }
   if (l1 == NULL&&l2 == NULL&&b != 0)
   {
    p->next = new ListNode(1);
   }
  }
  return head;
 }
};
void main()
{
 Solution *so = new Solution();
 ListNode* l1 = new ListNode(1);
 l1->next = new ListNode(8);
 ListNode* l2 = new ListNode(0);
 ListNode* res = so->addTwoNumbers(l1, l2);
 system("pause");
}
