class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0;
        String result = "";
        
        for(int i = 0; i< S.length(); i++){
            if(S.charAt(i) == '('){
                count++;
                if(count >= 2){
                    result += "(";
                }
            }else{
                count--;
                if(count >= 1){
                    result += ")";
                }
            }
        }
        return result;
    }
}
