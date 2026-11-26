public class TestSolution {
    private static final Solution SOLUTION = new Solution();
    private static final char[] BRACKETS = {'(', ')', '[', ']', '{', '}'};
    private static int passed;

    private static void check(String input, boolean expected) {
        boolean actual = SOLUTION.isValid(input);
        if (actual != expected) {
            throw new AssertionError(input + ": expected " + expected + ", got " + actual);
        }
        passed++;
    }

    // Independent reference: repeatedly remove adjacent matching pairs.
    private static boolean reference(String s) {
        String previous;
        do {
            previous = s;
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (!s.equals(previous));
        return s.isEmpty();
    }

    private static void exhaustive(String prefix, int remaining) {
        if (remaining == 0) {
            check(prefix, reference(prefix));
            return;
        }
        for (char ch : BRACKETS) exhaustive(prefix + ch, remaining - 1);
    }

    public static void main(String[] args) {
        check("()", true);
        check("()[]{}", true);
        check("(]", false);
        check("([])", true);
        check("([)]", false);
        check("]", false);
        check(")(", false);
        check("((", false);
        check("{[()]}", true);
        check("(".repeat(5000) + ")".repeat(5000), true);
        check("(".repeat(5000) + "]".repeat(5000), false);
        for (int length = 1; length <= 6; length++) exhaustive("", length);
        System.out.println("Passed " + passed + " local checks.");
    }
}
