class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //similar to count anagrams
        int k=s1.length();
        int[] freq=new int[26];
        for(char ch: s1.toCharArray()){
            freq[ch-'a']++;
        }

        int count=0;
        for(int a:freq){
            if(a!=0){
                count++;
            }
        }

        int i=0;
        int j=0;
        while(j<s2.length()){
            int in=s2.charAt(j)-'a';
            freq[in]--;
            if(freq[in]==0){
                count--;
            }

            if(j-i+1<k){
                j++;
            }
            else{
                if(count==0){
                    return true;
                }
                int out=s2.charAt(i)-'a';
                freq[out]++;
                if(freq[out]==1){
                    count++;
                }
                i++;
                j++;
            }
        }
        return false;
        
    }
}
