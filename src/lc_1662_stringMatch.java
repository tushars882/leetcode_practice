import java.util.Arrays;

public class lc_1662_stringMatch {
    static boolean inp(String[] word1 , String[] word2){
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//       for(String e : word1){
//           sb1.append(e);
//       }
//       for(String e: word2){
//           sb2.append(e);
//       }
//       char[] ch1 = sb1.toString().toCharArray();
//       char[] ch2 = sb2.toString().toCharArray();
//       String str1 = sb1.toString();
//       String str2 = sb2.toString();
//       int i = 0;
//       if(ch1.length >= ch2.length){
//           for(char ch : ch1 ){
//               if(i == str2.length() || ch !=str2.charAt(i)){
//                   return false;
//               }
//               i++;
//           }
//       }
//       if(ch2.length > ch1.length){
//           for(char ch : ch2 ){
//               if(i == str1.length() || ch !=str1.charAt(i)){
//                   return false;
//               }
//               i++;
//           }
//       }
//
//       return true;
        if(word1.length == 0 || word2.length == 0) return false;
        return String.join("", word1).equals(String.join("", word2));




    }
    public static void main(String args[]){
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.print(inp(word1 , word2));

    }
}
