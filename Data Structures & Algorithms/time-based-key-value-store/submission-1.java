class TimeMap {
    HashMap<String, List<TimeValuePair>> hm;
    public TimeMap() {
        hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            List<TimeValuePair> l=new ArrayList<>();
            l.add(new TimeValuePair(timestamp, value));
            hm.put(key, l);
        }
        else{
            List<TimeValuePair> l=hm.get(key);
            l.add(new TimeValuePair(timestamp, value));
        }
        
    }
    
    public String get(String key, int timestamp) {
        List<TimeValuePair> l=hm.get(key);
        if(l==null){
            return "";
        }
        int len=l.size();
        int low=0;
        int high=len-1;
        String ans="";
        while(low<=high){
            int mid=low+(high-low)/2;
            TimeValuePair current=l.get(mid);
            if(current.timestamp<=timestamp){
                ans=current.value;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
        
    }

    public class TimeValuePair{
        int timestamp;
        String value;
        TimeValuePair(int timestamp, String value){
            this.timestamp=timestamp;
            this.value=value;
        }
    }
}
