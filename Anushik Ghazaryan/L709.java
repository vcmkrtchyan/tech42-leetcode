class Solution {
    public String toLowerCase(String s) {
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            if(c[i] >= 65 && c[i] <= 95) {
                c[i] ^= 32;
            }
        }
        
        return new String(c);
    }
}