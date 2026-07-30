class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //optimized approach
        //sort
        Arrays.sort(nums);
        //iterate
        int len=nums.length;
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int target=-nums[i];
            int l=i+1;
            int r=len-1;
            while(l<r){
                if(nums[l]+nums[r]<target){
                    l++;
                }
                else if(nums[l]+nums[r]>target){
                    r--;
                }
                else{
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    ls.add(triplet);
                    l++;
                    r--;
                     // Skip duplicate left values
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
        return ls;
    }
}
