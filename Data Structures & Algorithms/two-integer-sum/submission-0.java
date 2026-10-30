class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int val = target - nums[i];
            if(!map.containsKey(val)) {
                map.put(nums[i], i);
            } else {
                int[] pair = new int[2];
                pair[0] = map.get(val);
                pair[1] = i;
                return pair;
            }
        }
        return new int[2];
    }
}
