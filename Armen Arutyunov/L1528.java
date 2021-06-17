class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i< s.length(); i++) {
            int position = indices[i];
            arr[position] = s.charAt(i);
      }
        return new String(arr);
    }
}
