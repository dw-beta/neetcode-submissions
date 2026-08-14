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

// brute force
// double for loop method
// get complement by subtracting target with values in array
// iterate through the array and find the complement

// second approach is to use a hashmap
// get complement by subtracting target with values in array
// check/lookup if value is available in hashmap
// if it's not, then store into the hashmap
// repeat
