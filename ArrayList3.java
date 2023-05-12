//Swap two number
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println("Before swap : "+ list);
        swap(list, idx1, idx2);
        System.out.println("After swap : "+ list);

        Collections.sort(list);
        System.out.println("Sort in ascending : "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sort in descending order : "+list);
    }   
}
