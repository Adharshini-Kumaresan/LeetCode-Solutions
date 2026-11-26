import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> expected = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(' -> expected.push(')');
                case '[' -> expected.push(']');
                case '{' -> expected.push('}');
                default -> {
                    if (expected.isEmpty() || expected.pop() != ch) {
                        return false;
                    }
                }
            }
        }
        return expected.isEmpty();
    }
}
