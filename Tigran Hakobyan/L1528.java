class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] sAsCharArray = new char[indices.length];
        
        for (int i = 0; i < indices.length; i++){
            sAsCharArray[indices[i]] =  s.charAt(i);
        }
        return new String(sAsCharArray);
    }
}
