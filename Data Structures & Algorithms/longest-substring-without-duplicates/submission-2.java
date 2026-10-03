class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (j < s.length()) {
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);
            if (hm.size() < j - i + 1) {
                while (hm.size() < j - i + 1 &&  i<j) {
                    char ch = s.charAt(i);
                    int value = hm.get(ch);
                    if (value == 1) {
                        hm.remove(ch);
                    }
                    else{
                        hm.put(ch, value - 1);
                    }
                    i++;
                }
            } else {
                len = Math.max(len, j - i + 1);
            }
            j++;
        }
        return len;
    }
}
