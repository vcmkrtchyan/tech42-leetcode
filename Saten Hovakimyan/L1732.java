public class L1732 {
    public int largestAltitude(int[] gain) {
        int atitude = 0;
        int largestAtitude = 0;
        
        for (int point = 0; point < gain.length; point++) {
            atitude += gain[point];
            if(atitude > largestAtitude) {
                largestAtitude = atitude;
            }
        }
        return largestAtitude;
    }
}
