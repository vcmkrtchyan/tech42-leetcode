public class L504 {
    public String convertToBase7(int num) {
        int numBase7 = 0;
        int multiplier = 1;
        while (num != 0) {
            numBase7 += (num % 7) * multiplier;
            num /= 7;
            multiplier *= 10;
        }
        return String.valueOf(numBase7);
    }
}