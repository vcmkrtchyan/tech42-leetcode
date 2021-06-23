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

// its not working
//class Solution {
//    int location;
//    int length;
//
//    public String longestPalindrome(String s) {
//        int len = s.length();
//
//        for(int i = len-1; i >= 0; i--) {
//            for(int j = 0; j < len - i; j++) {
//                for(int k = 0; k <= i/2; k++) {
//                    if(s.charAt(k+j) != s.charAt(j+i-k-1)) {
//                        break;
//                    }
//                }
//                return s.substring(j, j+i);
//            }
//        }
//        return null;
//    }
//}