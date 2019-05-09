package MultiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input) {
            Stack<Character> stack  = new Stack<>();
            for(int i = 0; i < input.length(); i++) {
                char a = input.charAt(i);
                if(a == '[' || a == '(' || a == '{' ) {
                    stack.push(a);
                } else if(a == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if(a == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if(a == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
            }
            return true;
        }
}
