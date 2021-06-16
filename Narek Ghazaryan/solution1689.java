class Solution {
    public int minPartitions(String n) {
        char charEl = '0';
        for(char symbole : n.toCharArray()) {
            charEl = symbole > charEl ? symbole : charEl;
        }
        return charEl - '0';
    }
}
