class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // a+b+c=0
        //for 2 sum, a+b=target
        //for 3 sum, b+c=-a(loop on a)
        //store in HashMap -> num, pos
        //In-efficient 2 sum extended approach

        int l=nums.length;
        
        List<List<Integer>> ls=new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<l;i++){
            int target = nums[i]*-1;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int j=i+1;j<l;j++){
                int key=target-nums[j];
                if(hm.containsKey(key)){
                    int pos=hm.get(key);
                    if(pos!=i && pos!=j){
                        List<Integer> triplet=new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(key);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                    
                    
                }
                hm.put(nums[j],j);
            }
        }
        ls.addAll(set);
        return ls;
        
    }
}
