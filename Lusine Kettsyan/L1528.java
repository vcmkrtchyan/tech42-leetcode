class Solution {
    public String restoreString(String s, int[] indices) {
        int length = s.length();
        char[] newCharArray = new char[length];
        
        for(int i = 0; i < length; i++) {
            newCharArray[indices[i]] = s.charAt(i);
        }
        
        
        return String.valueOf(newCharArray);
    }
}