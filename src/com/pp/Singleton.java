package com.pp;

public class Singleton {

    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        return  instance;
    }
}
class MainSingle{
    public static void main(String[] args) {

//        Singleton s = getInstance();
//        Singleton s2 = getInstance();

            Singleton s3 = Singleton.getInstance();
            Singleton s4 = Singleton.getInstance();

            System.out.println(s3.hashCode());
            System.out.println(s4.hashCode());


//        System.out.println(s.hashCode());
//        System.out.println(s2.hashCode());
        }
}

