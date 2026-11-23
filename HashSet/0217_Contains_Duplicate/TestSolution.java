class TestSolution {
    static void check(int[] input, boolean expected, String name) {
        boolean actual = new Solution().containsDuplicate(input);
        if (actual != expected) throw new AssertionError(name + ": expected " + expected + ", got " + actual);
        System.out.println("PASS " + name);
    }

    public static void main(String[] args) {
        check(new int[]{1,2,3,1}, true, "sample 1");
        check(new int[]{1,2,3,4}, false, "sample 2");
        check(new int[]{1,1,1,3,3,4,3,2,4,2}, true, "sample 3");
        check(new int[]{1}, false, "single element");
        check(new int[]{-1,-2,-1}, true, "negative duplicates");
        check(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE}, false, "integer extremes");
        check(new int[]{0,0}, true, "zero duplicates");
        check(new int[]{}, false, "empty array robustness");
    }
}
