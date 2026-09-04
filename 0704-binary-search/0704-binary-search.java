class Solution {

    int BS(int[] nums, int target, int s, int e){
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid]<target){
                s= mid+1;
            } else{
                e = mid-1;
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        return BS(nums, target, 0, nums.length-1);
        
    }
}