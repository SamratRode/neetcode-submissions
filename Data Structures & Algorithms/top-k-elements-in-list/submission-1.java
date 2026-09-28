class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //freq map
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.remove();
            }
        }

        //result
        int[] result=new int[k];
        int count=0;
        for(Map.Entry<Integer, Integer> entry: pq){
            result[count++]=entry.getKey();
        }
        return result;
    }
}
