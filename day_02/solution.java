class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(stack.empty() || ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                continue;
            }
            if(ch == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                } else {
                    return false;
                }
            } else if(ch == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                } else {
                    return false;
                }
            } else if(ch == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}