/*
Approach-
1. create a stack.
2. iterat over the string.
3. if next character is not ] then push in onto stack.
4. else if character is ] then pop from stack until we get [ and add the character sequence to res which will contain pattern to repeat.
5. then we will pop from stack until peek is digit and add the res to final result generated number times.
6. if stack will not be empty then we will add the result to stack.
*/
class Solution{
    static String decodedString(String s){
        // code here
        String result = "";
        String res = "";
        int n = 0;
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            if(!stk.isEmpty() && s.charAt(i) == ']') {
                res = "";
                String cnt = "";
                while(!stk.isEmpty() && stk.peek() != '[') {
                    res = stk.pop()+res;
                }
                if(!stk.isEmpty() && stk.peek() == '[') stk.pop();
                while (!stk.isEmpty() && Character.isDigit(stk.peek())) {
                    cnt = stk.pop()+cnt;
                }
                n = Integer.parseInt(cnt);
                for(int j = 0;j < n;j++) result += res;
                if(!stk.isEmpty()) {
                    for (int j = 0; j < result.length(); j++)
                        stk.push(result.charAt(j));
                    result = "";
                }
            }
            else stk.push(s.charAt(i));
        }
        return result;
    }
}