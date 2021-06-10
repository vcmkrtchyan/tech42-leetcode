class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {        
        int length1 = word1.length;
        int length2 = word2.length;
        
        if(length1 > length2)
            return(toStringAndCompare(word1, length1, word2, length2));
        else 
            return(toStringAndCompare(word2, length2, word1, length1));
    }
    
    private boolean toStringAndCompare(String[] word1, int length1, String[] word2, int length2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < length1; i++) {
            s1.append(word1[i]);            
            if(i<length2)           
                s2.append(word2[i]);
        }
        return(s1.toString().equals(s2.toString()));
    }
}