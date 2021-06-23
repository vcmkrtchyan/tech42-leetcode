class Solution {
    public String convertToBase7(int num) {
        if (num == 0){
            return "0";
        }
        
        String result = "";
        int tempNum = num > 0 ? num : -num;
        
        while(tempNum > 0){
            result = tempNum%7 + result;
            tempNum /= 7;
        }
        return num > 0 ? result : "-" + result;
    }
}
