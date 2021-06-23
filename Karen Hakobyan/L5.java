class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int longestLength = 0;
        int longestIndex = 0;

        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            if (isPalindrome(s, currentIndex - longestLength, currentIndex)) {
                longestLength += 1;
                longestIndex = currentIndex;
            } else if (currentIndex - longestLength - 1 >= 0 &&
                    isPalindrome(s, currentIndex - longestLength - 1, currentIndex)) {
                longestLength += 2;
                longestIndex = currentIndex;
            }
        }
        longestIndex++;
        return s.substring(longestIndex - longestLength, longestIndex);
    }
    
    public boolean isPalindrome(String s, int startIndex, int endIndex) {
        for (int i = startIndex, j = endIndex; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}