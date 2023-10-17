import Problems.SearchInput;

public class Driver {
    public static void main(String[] args) {
        SearchInput si = new SearchInput();
        int[] arr = {1, 3};
        System.out.println(si.searchInsert(si.nums, si.target1));
        System.out.println(si.searchInsert(si.nums, si.target2));
        System.out.println(si.searchInsert(si.nums, si.target3));
        System.out.println(si.searchInsert(arr, 3));
    }   
}
