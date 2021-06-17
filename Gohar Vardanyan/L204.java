public class L204 {
   public static int countPrimes(int n) {
      if (n <= 2) return 0;
      int count = n / 2;
      boolean[] array = new boolean[n];
      for (int i = 3; i < n; i += 2) {
          if (!array[i]) {
              for (long j = (long)i * i; j < n; j += i * 2) {
                  array[(int)j] = true;
              }
          } else count--; 
      }
      return count;
   }
}