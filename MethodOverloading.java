public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println("Add() with 2 Parameters ");
        System.out.println(add(4,6));

        System.out.println("Add() with 3 Parameters ");
        System.out.println(add(4,6,7));
    }
    
}
