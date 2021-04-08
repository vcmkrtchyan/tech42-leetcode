class Solution {
    public String removeOuterParentheses(String S) {
        int length = S.length();
        int openedParenthesesCount = 0;
        int closedParenthesesCount = 0;
        StringBuilder stringAfterRemoving = new StringBuilder();

        if (length > 10000) {
            return "The passed String must be less than or equal to 10000";
        }

        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '(') {
                openedParenthesesCount++;
            } else {
                if (S.charAt(i) == ')') {
                    closedParenthesesCount++;
                } else {
                    return "The passed String must contain only '(' and ')'";
                }
            }
        }

        if ((openedParenthesesCount != closedParenthesesCount) || (S.charAt(0) != '(')
                || (S.charAt(length - 1) != ')')) {
            return "The passed String must be a valid parentheses string";
        }
        openedParenthesesCount = 1;
        closedParenthesesCount = 0;

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