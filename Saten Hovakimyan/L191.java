public class L191 {
    public int hammingWeight(int n) {
        int countOfOneBits = 0;
        while (n != 0) {
            countOfOneBits += (n & 1);
            n >>>= 1;
        }
        return countOfOneBits;
    }
}
