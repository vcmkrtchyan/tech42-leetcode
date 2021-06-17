public class L709 {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 91 && ch > 64) {
               ch = (char)(ch ^ 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}