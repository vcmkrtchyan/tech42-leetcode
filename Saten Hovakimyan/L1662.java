import java.util.Objects;

public class L1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();
        int maxLength = (word1.length > word2.length) ? word1.length : word2.length;

        for (int i = 0; i < maxLength; i++) {
            if(i < word1.length) {
                firstWord.append(word1[i]);
            }
            if(i < word2.length) {
                secondWord.append(word2[i]);
            }
        }
        return Objects.equals(firstWord.toString(), secondWord.toString());
    }
}
