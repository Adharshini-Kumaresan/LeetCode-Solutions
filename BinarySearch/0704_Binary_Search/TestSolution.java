import java.util.Random;

public class TestSolution {
    static int count;
    static void check(int[] nums, int target, int expected) {
        int actual = new Solution().search(nums, target);
        if (actual != expected) throw new AssertionError("Expected " + expected + ", got " + actual);
        count++;
    }
    public static void main(String[] args) {
        check(new int[]{-1,0,3,5,9,12}, 9, 4);
        check(new int[]{-1,0,3,5,9,12}, 2, -1);
        check(new int[]{5}, 5, 0);
        check(new int[]{5}, 4, -1);
        check(new int[]{1,3}, 1, 0);
        check(new int[]{1,3}, 3, 1);
        check(new int[]{1,3}, 4, -1);
        check(new int[]{1,3}, 0, -1);
        Random random = new Random(704);
        for (int i = 0; i < 10000; i++) {
            int[] nums = new int[1 + random.nextInt(100)];
            int value = -500;
            for (int j = 0; j < nums.length; j++) nums[j] = value += 1 + random.nextInt(10);
            int target = i % 2 == 0 ? nums[random.nextInt(nums.length)] : -500 + random.nextInt(1100);
            int expected = -1;
            for (int j = 0; j < nums.length; j++) if (nums[j] == target) expected = j;
            check(nums, target, expected);
        }
        System.out.println("Passed " + count + " checks");
    }
}
