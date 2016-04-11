public class Solution {
    boolean isRight(char c)
    {
        if(c == ')' || c == '}' || c == ']') 
            return true;
        return false;
    }
    public boolean isValid(String s) 
    {
        Stack st = new Stack();
        for(int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i))
            {
                case '(':
                    st.push(')');
                    continue;
                case '{':
                    st.push('}');
                    continue;
                case '[':
                    st.push(']');
                    continue;
            }
            if(isRight(s.charAt(i)))
            {
                if(!st.empty())
                {
                    char tmp = (char)st.pop();
                    if(s.charAt(i) == tmp)
                        continue;
                }
                return false;
            }
        }
        if(!st.empty())
            return false;
        return true;
    }
}
