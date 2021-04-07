class Solution {
    public String removeOuterParentheses(String S) {
        int opened = 0;
        int closed = 0;
        int firstOpened = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                if(opened == 0) firstOpened = i;
                opened++;
            } else {
                closed++;
                if(closed == opened) {
                    result.append(S,firstOpened + 1, i);
                    opened = 0;
                    closed = 0;
                }
            }
        }
        return result.toString();     
    }
} 