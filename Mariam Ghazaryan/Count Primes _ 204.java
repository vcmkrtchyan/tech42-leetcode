class Solution {
    public int countPrimes(int n) {
        
       boolean [] isNotPrime = new boolean[n];
       int count = 0;
        
        for(int i =2; i < n; i++ ){
            if(isNotPrime[i]) continue;
            count++;
            for(long j =(long) i*i; j < n; j+=i){
                isNotPrime[(int)j]= true;
            }
        }
        return count;
      
    }
    
}