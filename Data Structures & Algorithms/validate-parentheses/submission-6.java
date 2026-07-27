class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
        return false;
        Deque<Character> stack = new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(c==')'){
                    if(stack.peek()!='('){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(c=='}'){
                    if(stack.peek()!='{'){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(c==']'){
                    if(stack.peek()!='['){
                        return false;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
