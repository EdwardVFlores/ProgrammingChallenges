class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> parenths = new HashMap<>();
        parenths.put('{','}');
        parenths.put('{','}');
        parenths.put('{','}');
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '}') {
                if(stack.size() < 1 || stack.pop() != '{') {
                    return false;
                }
            } else if(s.charAt(i) == ']') {
                if(stack.size() < 1 || stack.pop() != '[') {
                    return false;
                }
            } else if(s.charAt(i) == ')') {
                if(stack.size() < 1 || stack.pop() != '(') {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.size() == 0;
    }
}