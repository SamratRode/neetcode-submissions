class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key=getKey(strs[i]);
            List<String> values=hm.get(key);
            if(values==null){
                values=new ArrayList<>();
            }
            values.add(strs[i]);
            hm.put(key, values);
        }
        //bucket created now just traverse and store in list
        List<List<String>> l=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: hm.entrySet()){
            List<String> list=entry.getValue();
            l.add(list);
        }
        return l;

    }
    //get a key for bucket:
    public String getKey(String s){
        char[] ch=new char[s.length()];
        for(int i=0;i<ch.length;i++){
            ch[i]=s.charAt(i);
        }
        Arrays.sort(ch);
        String key="";
        for(char c:ch){
            key+=c;
        }
        return key;
    }
    
}
