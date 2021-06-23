class Solution {
    public int minPartitions(String n) {
        int num = 0;
        for (int i = 0; i < n.length(); i++){
            if(num < (n.charAt(i) - '0')){
                num = n.charAt(i) - '0';
                if (num == 9){
                    return num;
            }
        }
        return num;
    }
}
    

    
    //////////////////////
    
 class Solution {
    public int minPartitions(String n) {
        int max = 0b00000000;
        for (char ch : n.toCharArray()) {
            if (ch - 0b00110000 > max)
                max = ch - 0b00110000;
              if (max == 0b00001001){
                    return max;
            }
        }
        return max;
    }
}
