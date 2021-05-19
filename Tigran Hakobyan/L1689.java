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
        int num = 0;
        for (int i = 9; i >= 0; i--){
           if (n.contains("" + i)){
               num = i; 
               return num;
           }
        }
        return num;
    }
}
