class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      int length = word1.length>= word2.length ? word1.length : word2.length;
        String s1 = "";
        String s2 = "";
        for (int i = 0; i<length; i++){
            if(i<word1.length){
                s1 += word1[i];
            }
            if(i<word2.length){
                s2 += word2[i];
            }
        }
        return s1.equals(s2);
    }
}