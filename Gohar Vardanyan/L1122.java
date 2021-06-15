public class L1122 {
     public static int[] relativeSortArray(int[] arr1, int[] arr2) {
       int[] newArray = new int[1001];
        for (int n : arr1) {
            newArray[n]++;
        }
        int i = 0;
         for (int n : arr2) {
             while(newArray[n]-- > 0) {
                 arr1[i++] = n;
             }
         }
         for (int j = 0; j < 1001; j++) {
             while(newArray[j]-- > 0) {
                 arr1[i++] = j;
             }
         }
         return arr1;
    }
}