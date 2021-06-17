class Solution {
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] >= 65 && arr[i] <= 90) {
                int num = (int) arr[i];
                arr[i] = (char) (num + 32);
            }
        }
        return String.valueOf(arr);
    }
}
