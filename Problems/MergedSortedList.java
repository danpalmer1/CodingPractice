package Problems;

import java.util.Arrays;

//problem: merge 2 arrays of sorted integers
//input:
//  - nums1: array with length m+n where the first m elements should be merged and the last n elements are set to 0
//  - nums2: array with length n
//  - m: number of elements in nums1
//  - n: number of elements in nums2
//output:
//  store the final array inside nums1
public class MergedSortedList {
    // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    // Output: [1,2,2,3,5,6]  
    public int[] nums1 =  {1,2,3,0,0,0};
    public int[] nums2 = {2,5,6};
    public int m = 3;
    public int n = 3;

    // Input: nums1 = [1], m = 1, nums2 = [], n = 0
    // Output: [1]

    // Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    // Output: [1]
    public void mergeLists(int[] nums1, int[] nums2, int m, int n) {
        //iterate m-n times to completely cover nums1 array
        int j = m;
        for(int i = 0; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println("The result of the merge is: " + Arrays.toString(nums1));
    }
}
