class Solution {
    public int minPartitions(String n) {
        int count = 0;

        for(char c : n.toCharArray()) {
            if(count < c - '0') {
                count = c - '0';
            }
        }

        return count;
    }
}