class Solution {
    public String encode(List<String> strs) {
        String encodedString = "";
        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            encodedString += s.length() + "#" + s;
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j + 1, j + 1 + len);
            decodedList.add(word);
            i = j + 1 + len;
            j = i;
        }

        return decodedList;
    }
}
