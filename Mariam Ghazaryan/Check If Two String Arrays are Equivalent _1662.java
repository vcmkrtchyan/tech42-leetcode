class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
      int i1 = 0;
      int i2 = 0;


    for(int temp1 = 0, temp2 = 0; i1 < word1.length && i2 < word2.length; ){

        if(word1[i1].charAt(temp1++) != word2[i2].charAt(temp2++)){
            return false;
        }

        if(temp1 == word1[i1].length()){
            i1++;
            temp1 = 0;
        }

        if(temp2 == word2[i2].length()){
            i2++;
            temp2 = 0;
        }
    }
       return i1 == word1.length && i2 == word2.length; 
        
    }
}
