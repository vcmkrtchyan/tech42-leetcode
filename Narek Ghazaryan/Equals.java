class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String txt1 = String.join("", word1);
        String txt2 = String.join("", word2);
        
        if(txt1.equals(txt2)){
            return true;
        }else{
            return false;
        }
    }
}
