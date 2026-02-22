// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// LEETCODE - 33. SEARCH IN ROTATED SORTED ARRAY 

class SearchRotated {
    public int search(int[] nums, int target) {
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                index =i ;
            }
        }
        return index;
    }
}
