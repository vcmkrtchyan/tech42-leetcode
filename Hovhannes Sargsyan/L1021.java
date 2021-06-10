class Solution {
    public String removeOuterParentheses(String S) {
        int first = 0;
        int end = 0;
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') 
                first++;
            else
                end++;
            if(first == end) {
                builder.append(S,i-((first-1)+(end-1)),i);
                first = 0;
                end = 0;
            }
        }
        return builder.toString();
    }
}
