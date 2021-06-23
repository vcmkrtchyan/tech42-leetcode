class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        int left = 0, right = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++){
            
            char middle = s.charAt(i);
            
            left = i;
            right = i;
            
            while (left >= 0 && s.charAt(left) == middle){
                left--;
            }
            
            while (right < length && s.charAt(right) == middle){
                right++;
            }
            
            while(left >= 0 && right < length){
                if (s.charAt(left) != s.charAt(right)){
                    break;
                }
                left--;
                right++;
            }
            
            if (end - start < right - (left + 1) ){
                start = left + 1;
                end = right;
            }
        }
     return s.substring(start, end);   
    }
}
