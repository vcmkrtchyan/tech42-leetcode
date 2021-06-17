public class L7 {
    public int reverse(int x) {
        long reverseNumber = 0;
        while (x != 0) {
            reverseNumber = (reverseNumber * 10) + (x % 10);
            x /= 10;
        }
        if (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverseNumber;
        }
    }
}
