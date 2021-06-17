class Solution {
    public String removeOuterParentheses(String S) {
        int length = S.length();
        int openedParenthesesCount = 1;
        int closedParenthesesCount = 0;
        StringBuilder stringAfterRemoving = new StringBuilder();
        
        for (int i = 1; i < length; i++) {
            if (S.charAt(i) == '(') {
                openedParenthesesCount++;
            } else {
                closedParenthesesCount++;
            }

            if (openedParenthesesCount == closedParenthesesCount) {
                stringAfterRemoving.append(S, i - (openedParenthesesCount * 2 - 2), i);
                openedParenthesesCount = 0;
                closedParenthesesCount = 0;
            }
        }
        return stringAfterRemoving.toString();
    }
}
