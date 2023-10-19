import Problems.MergedSortedList;
import Problems.SearchInput;

public class Driver {
    public static void main(String[] args) {
        Driver.testMergedSortedList();
    }   

    public static void testSearchInput() {
        SearchInput si = new SearchInput();
        int[] arr = {1, 3};
        System.out.println(si.searchInsert(si.nums, si.target1));
        System.out.println(si.searchInsert(si.nums, si.target2));
        System.out.println(si.searchInsert(si.nums, si.target3));
        System.out.println(si.searchInsert(arr, 3));
    }

    public static void testMergedSortedList() {
        MergedSortedList msl = new MergedSortedList();
        msl.mergeLists(msl.nums1, msl.nums2, msl.m, msl.n);
    }
}
