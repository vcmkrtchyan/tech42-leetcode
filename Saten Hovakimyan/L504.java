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

    // public static String convertToBase7(int num) {
    // StringBuilder numBase7 = new StringBuilder();
    // int numAbs = Math.abs(num);
    // while (numAbs >= 7) {
    // numBase7.append(numAbs % 7);
    // numAbs /= 7;
    // }
    // return (num >= 0) ? numBase7.append(numAbs).reverse().toString() :
    // numBase7.append(numAbs).append('-').reverse().toString();
    // }
}