class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int item : nums) {
            if (item > first) {
                third = second;
                second = first;
                first = item;
            } else if (item > second && item != first) {
                third = second;
                second = item;
            } else if (item > third && item != second && item != first) 
                third = item;
        }
        if(third == Long.MIN_VALUE)
            return (int) first;
        return (int) third;
    }
}
