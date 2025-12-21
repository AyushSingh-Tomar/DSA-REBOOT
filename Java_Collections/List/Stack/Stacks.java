package Java_Collections.List.Stack;

import java.util.*;

public class Stacks {
    public static boolean checkParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char element : s.toCharArray()) {
            if (element == '{') {
                stack.push('}');
            } else if (element == '(') {
                stack.push(')');
            } else if (element == '[') {
                stack.push(']');
            } else if (!stack.isEmpty() && stack.peek() == element) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        String answer = "Pass";
        map.put("()", true);
        map.put("{}", true);
        map.put("[]", true);
        map.put("(){}[]", true);

        map.put("({[]})", true);
        map.put("{[()]}", true);
        map.put("((()))", true);
        map.put("{{[[(())]]}}", true);

        map.put("()[]{}", true);
        map.put("{()}[]", true);
        map.put("[{()}]", true);

        map.put("(", false);
        map.put("{", false);
        map.put("[", false);
        map.put(")", false);
        map.put("}", false);
        map.put("]", false);

        map.put("(]", false);
        map.put("{)", false);
        map.put("[}", false);
        map.put("([)]", false);
        map.put("{[}]", false);

        map.put(")", false);
        map.put("}(", false);
        map.put("][", false);
        map.put("())", false);

        map.put("(()", false);
        map.put("{[()]", false);
        map.put("({[]})(", false);
        map.put("({[]}})", false);

        map.put("", true);
        map.put(" ", false);
        map.put("a", false);
        map.put("(a)", false);

        map.put("(((((((((())))))))))", true);
        map.put("(((((((((()))))))))", false);
        map.put("[][][][][][]", true);
        map.put("[][][][][]]", false);

        for (Map.Entry<String, Boolean> e : map.entrySet()) {

            String key = e.getKey();
            Boolean Value = e.getValue();

            if (checkParenthesis(key) != Value) {
                answer = "Aborted";
                break;
            }

        }
        System.out.println(answer);
    }
}
