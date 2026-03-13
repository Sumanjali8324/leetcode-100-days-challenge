import java.util.*;

public class solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int more = target - num;

            if(mpp.containsKey(more)) {
                return new int[]{mpp.get(more), i};
            }

            mpp.put(num, i);
        }

        return new int[]{-1, -1};
    }
}