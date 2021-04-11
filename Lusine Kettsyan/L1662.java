public class L1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        //String[] word1 = {"a", "bc"}, word2 = {"a", "cb"};
        System.out.print(arrayStringsAreEqual(word1, word2));

    }

    private static String convertArrayToString(String[] word) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length; i++) {
            sb.append(word[i].toLowerCase());
        }
        return sb.toString();
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return  convertArrayToString(word1).equals( convertArrayToString(word2));
    }
}
