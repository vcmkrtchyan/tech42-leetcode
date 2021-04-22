class Solution {
    public String restoreString(String s, int[] indices) {
        char[] S1 = new char[indices.length];
        int j = 0;
        for(int i : indices) {
            S1[i] = s.charAt(j);
            j++;
        }
        return String.valueOf(S1);
    }
}