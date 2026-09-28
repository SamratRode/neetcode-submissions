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
        return new ArrayList<>(hm.values());   
    }
    
    public String getKey(String s){
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
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
