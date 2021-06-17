class Solution {
    public int reverse(int x) {
        long result = 0;
        
        while(x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        
        if((result > Integer.MAX_VALUE) || (result < Integer.MIN_VALUE))
            return 0;
        
        return (int)result;
    }
}

// class Solution {
//     public int reverse(int x) {
//         StringBuilder result = new StringBuilder();
        
//         if(x < 0) {
//             result.append("-");
//             x = -1 * x;
//         }
        
//         while(x != 0) {
//             result.append(x % 10);
//             x /= 10;
//         }
        
//         try {
//             x = Integer.parseInt(result.toString());
//             return x;
//         } catch (Exception e) {
//             return 0;
//         }
//     }
// }