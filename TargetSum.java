import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                int complementIndex = numMap.get(complement);
                return new int[]{complementIndex, i};
            }

            numMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 19;

        int[] result = findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Two numbers that add up to the target sum " + target + " are :" );
            System.out.println("[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum " + target );
        }
    }
}
