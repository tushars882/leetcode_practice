import java.util.Stack;

public class lc_1768_MergeStringAlternate {
    static String inp(String word1 , String word2){
        int len = Math.max(word1.length() , word2.length());
  StringBuffer sb = new StringBuffer();
  for(int i = 0 , j = 0 ; i < len ; i++ , j++){
      if(i < word1.length()){
          sb.append(word1.charAt(i));
      }
      if(j < word2.length()){
          sb.append(word2.charAt(j));
      }
  }
  String str = sb.toString();
  return str;

}

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(lc_1768_MergeStringAlternate.inp(word1 , word2));
    }

}
