class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hashmap approach with a value -> index pairing scheme
        HashMap<Integer, Integer> seen = new HashMap<>();
        // Iterate through the array and get the complement
        // by subtracting target with the values inside the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check/lookup if the value exists inside the hashmap
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            else {
                // If the value doesn't exist, then 
                // add the complement to the hashmap
                seen.put(nums[i], i);
            }
        }
        // Return empty if there is no solution
        return new int[]{};
    }
}
