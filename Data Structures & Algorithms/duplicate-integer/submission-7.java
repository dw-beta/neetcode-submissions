// Use a hashset approach
// Hashset acting as storage for "seen" numbers
// Iterate through the array and check in the hashset if value exists already
// If not then add the value to the hashset

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            else {
                seen.add(nums[i]);
            }
        }
        return false;
    }
}