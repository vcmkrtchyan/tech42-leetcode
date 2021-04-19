public class L504 {
     public String convertToBase7(int num) {
        int result = 0;
        int count = 1;
        while (num != 0) {
            result = (num % 7) * count + result;
            num = num / 7;
            count *= 10;
        }
        return String.valueOf(result);
     }   
}