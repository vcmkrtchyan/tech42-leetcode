class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(int i=0; i<S.length(); i++) {
            if(count == 0) {
                count++;
            } else if(count == 1 && S.charAt(i) == ')') {
                count--;
            } else {
                sb.append(S.charAt(i));
                
                if(S.charAt(i) == '(') {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
