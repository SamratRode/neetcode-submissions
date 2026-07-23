class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        HashMap<Integer, Integer> hm=new HashMap<>();
        //frequency map
        for(int a:nums){
            hm.put(a, hm.getOrDefault(a,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(a.getValue(), b.getValue()));
        // top k logic, min Heap removes min elements so the remaining are top k
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            // int key=entry.getKey();
            // int value=entry.getValue();
            pq.add(entry);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int count=0;
        while(!pq.isEmpty()){
            Map.Entry<Integer, Integer> entry=pq.poll();
            result[count++]=entry.getKey();
        }
        return result;
    }
}
