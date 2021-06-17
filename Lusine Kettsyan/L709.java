class Solution {
    public String toLowerCase(String str) {
        char[] charArr = str.toCharArray();
        for(int i =0; i < str.length(); i++ ) {
            if(charArr[i] < 97) {
                charArr[i] = (char) (charArr[i] + 32);
            }

        }
        return String.valueOf(charArr);
    }
}
