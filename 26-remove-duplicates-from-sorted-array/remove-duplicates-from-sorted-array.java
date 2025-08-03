class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length == 0) return 0;

        int k = 1; // Start from index 1 since the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Move the unique element forward
                k++;
            }
        }

        return k; // Number of unique elements 
    }
}