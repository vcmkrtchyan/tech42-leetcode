class Solution {
    public String removeOuterParentheses(String S) {
        
          StringBuilder sb = new StringBuilder();
        int sum = 0;
        int beginning = 0;
        int end = 0;

        for(int i = 0; i < S.length(); i++){

            if(S.charAt(i) == 40 ){
                sum++;
            } else sum--;

            if(sum == 0){
                end = i;
                sb.append(S, beginning+1, end);
                beginning = end+1;
            }

        }

        return sb.toString();
        
    }
}
