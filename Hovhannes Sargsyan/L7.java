class Solution {
    public int reverse(int x) {
        int a = 0; 
        long y =0;
        while(x != 0) {
            a = x % 10;
            y = y * 10 + a;
            x/=10;
        }
        if(y > 2147483647 || y < -2147483648 )
            return 0;
        return (int) y;
    }   
}
