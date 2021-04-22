class Solution {
    public String restoreString(String s, int[] indices) {
        
        // first version
        
         char [] result = new char[indices.length];
         int temp = 0;

         for(int i =0; i < indices.length; i++){
            temp = indices[i] ;
            result[temp] = s.charAt(i);


        }

        return String.valueOf(result);
        
    //   second version 
        
    /*  StringBuilder sb = new StringBuilder();
        int temp = 0;
        int i = 0;
        int j = 0;

        while(i < indices.length){
           if(indices[j] == i){
               sb.append(s.charAt(j));
               i++;
               j=0;
           } else j++;

       }
        return sb.toString(); */
        
    }
}