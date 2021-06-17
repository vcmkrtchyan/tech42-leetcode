public class L657 {
    public boolean judgeCircle(String moves) {
        int countH = 0;
        int countV = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') countH++;
            else if(ch == 'R') countH--;
            else if(ch == 'U') countV++;
            else countV--;
        }
        return countV == 0 && countH == 0;
    }
}