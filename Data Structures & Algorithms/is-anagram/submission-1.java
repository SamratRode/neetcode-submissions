class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        // add freq map
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
        //remove keys that are found
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            if(!hm.containsKey(key)){
                return false;
            }
            int count=hm.get(key);
            if(count==1){
                hm.remove(key);
            }
            else{
                hm.put(key, count-1);
            }
        }

        //anagram check
        if(hm.isEmpty()){
            return true;
        }
        return false;

    }
}
