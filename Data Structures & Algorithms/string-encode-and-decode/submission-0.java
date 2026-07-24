class Solution {

    public String encode(List<String> strs) {
        String result="";
        for(String s:strs){
            result+=s.length()+"#"+s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> words=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+len);
            words.add(word);
            i=j+1+len;
        }
        return words;
    }
}
