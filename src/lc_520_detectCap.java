public class lc_520_detectCap {
    static boolean inp(String word){
      String up = word.toUpperCase();
      String down = word.toLowerCase();
      String one = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
      if(word.equals(up) || word.equals(down)){
          return true;
      }
      else if(word.equals(one)){
          return true;
      }
        else{
            return false;
      }
    }
    public static void main(String[] args){
        System.out.println(inp("Tushar"));
    }
}
