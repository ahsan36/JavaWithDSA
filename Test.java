import java.util.Scanner;
class Rectangle{
    int length , breadth;
    Rectangle(int x, int y){
        length = x;
        breadth = y;
    }
    int Area(){
        return length * breadth;
    }
}
public class Test {
    public static void main(String args[]){
        Rectangle r1 =new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);

        int a1 = r1.Area();
        int a2 = r2.Area();
        
        System.out.println("Area 1 : " +a1);
        System.out.println("Area 2 : " +a2);

    }    
}
