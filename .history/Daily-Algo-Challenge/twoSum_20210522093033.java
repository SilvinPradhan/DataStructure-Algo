import java.util.HashMap;

class 1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int comp = target - nums[i];
            if(numMap.containsKey(comp)){
                return new int[] {numMap.get(comp), i};
            }
            
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match");
    }
}