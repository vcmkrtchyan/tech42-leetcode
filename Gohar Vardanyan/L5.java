public class L5 {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int firstLength = longestSubPalindrome(s, i, i);
            int secondLength = longestSubPalindrome(s, i, i + 1);
            int maxLength;
            if (firstLength > secondLength) {
                maxLength = firstLength;
            } else {
                maxLength = secondLength;
            }
            if (end - start < maxLength) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int longestSubPalindrome(String s, int i, int j) {
        int left = i;
        int right = j;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return right - left - 1;
    }
}