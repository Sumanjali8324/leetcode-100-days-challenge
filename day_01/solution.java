// import java.util.*;

public class solution {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int target = 4;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int more = target - num;

            if(mpp.containsKey(more)) {
                return new int[]{mpp.get(more), i};
            }

            mpp.put(num, i);
        }

        return new int[]{-1,-1};
    }
}