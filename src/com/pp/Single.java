package com.pp;

public class Single {
    private static Single instance = null;

    private Single(){};
     public static Single getInstance() {
         synchronized (Single.class) {


             try {
                 if (instance == null) {
                     instance = new Single();
                 }
             } catch (Exception e) {
                 return null;
             }
             return instance;
         }
     }
     public Object readResolve(){
         return instance;
     }

}

class Main{

    public static void main(String[] args) {
        Single s = Single.getInstance();
        Single s2 = Single.getInstance();

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
