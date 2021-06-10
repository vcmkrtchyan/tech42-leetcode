public class L504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean is_negative = num < 0;
        StringBuilder result = new StringBuilder();
        int temp = Math.abs(num);
        while (temp > 0) {
            result.insert(0, temp % 7);
            temp /= 7;
        }
        return is_negative ? "-" + result : result.toString();
    }
}
