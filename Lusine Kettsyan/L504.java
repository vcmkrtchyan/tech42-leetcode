class Solution {
    public static String convertToBase7(int num) {
		StringBuilder str = new StringBuilder();
		int numAbs = Math.abs(num);
		int left;
	
		while(numAbs > 0) {
			left = numAbs % 7;
			numAbs /= 7;
			str.append(String.valueOf(left));
		}

		if(num < 0) {
			str.append('-');
		}
		return str.reverse().toString();
	}
}