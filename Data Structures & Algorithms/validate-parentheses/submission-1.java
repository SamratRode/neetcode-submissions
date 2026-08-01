class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        HashSet<Character> hs=new HashSet<>();
        hs.add('{');
        hs.add('(');
        hs.add('[');
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(hs.contains(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();

                if((ch=='}' && top=='{') ||(ch==')' && top=='(') ||  (ch==']' && top=='[')){  

                    stack.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}
