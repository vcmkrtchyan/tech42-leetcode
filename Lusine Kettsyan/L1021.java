class L1021 {
    public static void main(String[] args) {
        String str =  "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(str));
    }

    private static String removeOuterParentheses(String S) {
        int openCount = 0;
        int closedCount = 0;
        Integer startingIndex = null;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                if(startingIndex == null) {
                    startingIndex = i;
                }
                openCount++;
            }else {
                closedCount++;
            }
            if(openCount == closedCount) {
                sb.append(S, startingIndex + 1, i);
                startingIndex = null;
                openCount = 0;
                closedCount = 0;
            }
        }
        return sb.toString();
    }
}