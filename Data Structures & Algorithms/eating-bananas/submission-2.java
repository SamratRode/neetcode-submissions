class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k_min=1;
        int k_max=0;
        for(int p:piles){
            k_max=Math.max(k_max, p);
        }
        // got k_min and k_max, now binary search, finding ceil element logic
        while(k_min<=k_max){
            int k_middle=k_min+(k_max-k_min)/2;
            if(calculateHours(k_middle, piles)>h){
                k_min=k_middle+1;
            }
            else{
                k_max=k_middle-1;
            }
        }
        return k_min;
        
    }
    
    //Remember don't use Math.ceil((float)piles[i]/k), as float is correct upto 7 decimal places, IEEE format
    //Instead from now on to find floor and ceil use:
    //ceil of (a/b) => (a+(b-1))/b
    //floor 0f (a/b) => (a-(b-1))/b
    public int calculateHours(int k, int[] piles){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=((piles[i]+k-1)/k);
        }
        return hours;
    }
}
