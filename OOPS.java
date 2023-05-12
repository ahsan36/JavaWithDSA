class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getcolor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
    
}


 
