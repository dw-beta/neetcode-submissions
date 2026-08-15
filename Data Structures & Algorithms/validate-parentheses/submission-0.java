class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char parenthesis : s.toCharArray()) {
            if (parenthesis == '(' || parenthesis == '[' || parenthesis == '{') {
                stack.push(parenthesis);
            }
            else {
                char expected = switch (parenthesis) {
                    case ')' -> '(';
                    case ']' -> '[';
                    case '}' -> '{';
                    default -> ' ';
                };
                if (stack.isEmpty() || stack.peek() != expected) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
