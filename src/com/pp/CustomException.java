package com.pp;

public class CustomException extends Exception {

    public CustomException(String message){
        super(message);
    }
}

class Calculator{
    public int inp(int a , int b) throws CustomException {
        if(b == 0) {
                throw new CustomException("cannot divide by 0");
            }
        return a/b;
    }
}

class MainExp{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        try{
            int res = cal.inp(10 ,0);
            System.out.println(res);
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The code has been exceuted");
        }
    }
}
