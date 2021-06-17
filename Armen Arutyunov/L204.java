public class L204 {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] table = new boolean[n];
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (!table[i]) {
                for (int j = i * i; j < n; j += i) {
                    table[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!table[i]) count++;
        }
        return count;
    }
}
