class Solution {
    public String removeOuterParentheses(String S) {
        int opened = 0;
        int closed = 0;
        StringBuilder result = new StringBuilder();
        int length = S.length();
        
        for(int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == '(') opened++;
            else closed++;
            if (opened == closed) {
                result.append(S, i-((opened-1)*2), i);
                opened = 0;
                closed = 0;
            }
        }
        return result.toString();
    }
}
