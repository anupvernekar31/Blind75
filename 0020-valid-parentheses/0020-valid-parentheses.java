class Solution {
    // public boolean isValid(String s) {
    //     Stack<Character> st = new Stack<Character>();
        
    //     for(int i=0;i<s.length();i++){
    //         char c = s.charAt(i);
    //         if(c == '{'  || c == '[' || c == '('){
    //             st.push(c);
    //             continue;
    //         }
    //         if (st.isEmpty())
    //             return false;
            
    //         char check;
    //         switch (c) {
    //         case ')':
    //             check = st.pop();
    //             if (check == '{' || check == '[')
    //                 return false;
    //             break;

    //         case '}':
    //             check = st.pop();
    //             if (check == '(' || check == '[')
    //                 return false;
    //             break;

    //         case ']':
    //             check = st.pop();
    //             if (check == '(' || check == '{')
    //                 return false;
    //             break;
    //         }
            
    //     }
    //     return st.isEmpty();
    // }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack is empty when encountering closing bracket → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching pairs
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // String is valid only if stack is empty at the end
        return stack.isEmpty();
    }
}