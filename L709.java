class Solution {
    public String toLowerCase(String str) {
      char[] strToCharArray = str.toCharArray();
        for (int i = 0; i < strToCharArray.length; i++)
            if (64 < strToCharArray[i] && strToCharArray[i] < 91)
                strToCharArray[i] = (char) (strToCharArray[i] +32);
        return new String(strToCharArray);
    }
}
