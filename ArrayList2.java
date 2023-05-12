import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //get 
        int element = list.get(2);
        System.out.println(element);

        //delete
        list.remove(2);
        System.out.println(list);

        //set
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Add element at index
        list.add(1, 9);
        System.out.println(list);

        //Size
        System.out.println(list.size());
    }
    
}
