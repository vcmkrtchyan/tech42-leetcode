class Solution {
    public int countPrimes(int n) {
        if(n <= 2) 
            return 0;
        
        boolean[] not_prime = new boolean[n];
        
        for(int i = 2; i * i < n; i++) {
            if(not_prime[i]) 
                continue;
            for(int j = i * i; j < n; j += i) {
                not_prime[j] = true;
            }
        }
        
        int count = 1;
        for(int i = 3; i < n; i += 2) {
            if(!not_prime[i]) {
                count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;
//         n--;
        
//         while (n >= 2) {
//             if(isPrime(n)) {
//                 count++;
//             }
//             n--;
//         }
        
//         return count;
//     }
    
//     private boolean isPrime(int number) {
//         if(number == 1) {
//             return false;
//         }
//         if((number == 2) || (number == 3)) {
//             return true;
//         }
        
//         if((number % 2 == 0) || (number % 3 == 0)) {
//             return false;
//         }
//         int sqrt = (int) Math.sqrt(number);
//         for(int i = 3; i*i <= number; i += 2) {
//             if(number % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }