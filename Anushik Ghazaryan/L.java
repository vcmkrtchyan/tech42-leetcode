class Solution {
    int location;
    int length;

    public String longestPalindrome(String s) {
        int len = s.length();

        if(len < 2) {
            return s;
        }

        for(int i = 0; i < len; i++) {
            check(s, i, i);
            check(s, i, i+1);

            if(length == len) {
                break;
            }
        }

        return(s.substring(location, location + length));
    }

    private void check(String s, int x, int y) {
        while(x >= 0 && y < s.length() && s.charAt(x) == s.charAt(y)) {
            x--;
            y++;
        }

        if(length < y - x - 1) {
            length = y - x - 1;
            location = x+1;
        }
    }
}