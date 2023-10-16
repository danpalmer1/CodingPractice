public class SearchInput {
    int[] nums = {1, 3, 5, 6};
    int target1 = 5;
    int target2 = 2;
    int target3 = 7;
    int[] nums2 = {1};
    int target4 = 1;

    /*
     * Search Insert
     * inputs:
     *  nums: int array
     *  target: number we're looking to insert/find
     *      
     * outputs:
     *  array where the target exists or should exist in the input array
     * 
     * cases:
     *  1. target is found
     *  2. insert at beginning
     *     if target < nums[0]
     *  3. insert in middle
     *  4. insert at end
     */
    public int searchInsert(int[] nums, int target) {
        int idx = -1;
        for(int i = 0; i < nums.length; i++) {
            //only do this until i is equal to nums.length - 1
            if(nums[i] == target) idx = i;
            else {
                //check if it should be inserted here
                if(i != nums.length-1) {
                    if(nums[i] < target && nums[i + 1] > target) {
                        idx = i + 1;
                    }
                }
            }
        }
        if(target < nums[0] && idx == -1) idx = 0;
        if(target > nums[nums.length-1] && idx == -1) idx = nums.length;
        return idx;
    }
}
