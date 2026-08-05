class Solution {
    public int findMin(int[] nums) {
        int len=nums.length;
        int low=0;
        int high=len-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];

    }
}
