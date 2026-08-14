class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hashmap approach
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            else {
                // add complement to the hashmap
                seen.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

// brute force
// double for loop method
// get complement by subtracting target with values in array
// iterate through the array and find the complement

// second approach is to use a hashmap
// get complement by subtracting target with values in array
// check/lookup if value is available in hashmap
// if it's not, then store into the hashmap
// repeat
