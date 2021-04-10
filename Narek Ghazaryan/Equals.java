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

// AND VERY BAD VERSION
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
                String txt = "";
                String txt2 = "";
                for(int i = 0; i < word1.length; i++){
                        txt += word1[i];
                }
                
        
                for(int j = 0; j < word2.length; j++){
                        txt2 += word2[j];
                }
                
                if(txt.equals(txt2)){
                        return true;
                }else {
                        return false;
                }

    }
}
