public class lc_38_countAndSay {
    static String inp(int n){
//        if(n == 1){
//            return "1";
//        }
//        String s = inp(n-1);
//        StringBuilder sb = new StringBuilder();
//        String st = Integer.toString(n);
//        int i = 0;
//
//
//        boolean flag = true;
//        while(flag != false){
//            int count = 1;
//            for( i = 0 ; i < st.length()-1 ; i++) {
//                if (st.charAt(i) == st.charAt(i + 1)) {
//                    count++;
//                } else if(i != st.length() -2){
//                    sb.append(count);
//                    sb.append(st.charAt(i));
//                    count = 1;
//                }
//                if (i == st.length() - 2) {
//                    sb.append(count);
//                    sb.append(st.charAt(i));
//                    flag = false;
//                }
//
//            }
//            if(i == st.length() -1 && st.charAt(i) != st.charAt(i-1)){
//                count = 1;
//                sb.append(count);
//                sb.append(st.charAt(i));
//            }
//
//        }



        if(n == 1){
            return "1";
        }
        StringBuilder res = new StringBuilder();
        String s = inp(n-1);
        int counter = 0;

        for(int i = 0 ; i < s.length() ;i++){
            counter++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                res.append(counter).append(s.charAt(i));
                counter = 0;
            }
        }

        return res.toString();


    }
    public static void main(String args[]){
        System.out.print(inp(4));
    }

}
