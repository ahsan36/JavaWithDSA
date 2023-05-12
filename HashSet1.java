import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);

        System.out.println(set);

        HashSet<String> se = new HashSet<>();

        se.add("Delhi");
        se.add("Mumbai");
        se.add("Noida");
        se.add("Bengaluru");

        System.out.println(se);

        // Iterator it = se.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for(String city : se){
        //     System.out.println(city);
        // }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
    
}
