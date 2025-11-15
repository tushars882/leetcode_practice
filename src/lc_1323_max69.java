public class lc_1323_max69 {
    static int inp(int num){
        String str = Integer.toString(num);
        char ch[] = str.toCharArray();
        for(int  i = 0 ; i < ch.length ; i++){
            if(ch[i] == '6'){
                 ch[i]= '9';
                break;
            }

        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ch.length ;i++) {
            sb.append(ch[i]);
        }
        sb.toString();
        return (Integer.parseInt(String.valueOf(sb)));
    }
    public static void main(String args[]){
        int num = 9669;
        System.out.println(inp(num));
    }
    }

