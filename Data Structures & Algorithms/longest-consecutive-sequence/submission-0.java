class Solution {
    public int longestConsecutive(int[] nums) {
        // add all in HashSet
        HashSet<Integer> hs=new HashSet<>();
        for(int a: nums){
            hs.add(a);
        }
        // traverse HashSet
        int max=0;
        for(int a:hs){
            if(!hs.contains(a-1)){
                int current=1;
                int currNum=a;
                while(hs.contains(currNum+1)){
                    current++; 
                    currNum++;   
                }
                max=Math.max(max,current);
            }
        }
        return max;
        
    }
}
