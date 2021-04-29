class Solution1 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> m = new HashMap();
        
        for (int number : arr2) {
            m.put(number, 0);
        }
        
        int lastIndex = arr1.length - 1;
        int[] result = new int[arr1.length];
        
        for (int number : arr1) {
            if (m.containsKey(number)) {
                m.put(number, m.get(number) + 1);
            } else {
                result[lastIndex--] = number;
            }
        }
        
        int index = 0;
        for (int number : arr2) {
            int count = m.get(number);
            for (int i = 0; i < count; i++) {
                result[index++] = number;
            }
        }
        
        Arrays.sort(result, index, result.length);
        return result;
    }
}

class Solution2 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int [] maxArray = new int [1001];
        for (int i : arr1) {
            maxArray[i]++;
        }
        
        int j = 0;
        for (int i : arr2) {
            while (maxArray[i]-- > 0) {
                arr1[j++] = i;
            }
        }
        
        for (int i = 0; i < maxArray.length; i++) {
            while(maxArray[i]-- > 0) {
                arr1[j++] = i;
            }
        }
        
        return arr1;
    }
}