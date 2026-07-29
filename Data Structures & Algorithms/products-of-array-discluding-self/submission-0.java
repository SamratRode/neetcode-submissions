class Solution {
    public int[] productExceptSelf(int[] nums) {
        //calculate prefix and postfix product and then multiply them
        int l=nums.length;
        int[] prefixProduct=new int[l];
        int[] postfixProduct=new int[l];
        prefixProduct[0]=1;
        postfixProduct[l-1]=1;
        for(int i=1;i<l;i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
            postfixProduct[l-1-i]=postfixProduct[l-i]*nums[l-i];
        }
        int[] result=new int[l];
        for(int i=0;i<l;i++){
            result[i]=prefixProduct[i]*postfixProduct[i];
        }
        return result;
    }
}  
