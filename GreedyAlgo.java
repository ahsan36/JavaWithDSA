/*Activity Selection :-
 * You are given n activities with their satart and end times. select the maximum number 
 *   of activities that can be performed by the single person, assuming that the person can
 *    only work on a single activity at a time.
 * Activities are sorted according to end time.
 */

import java.util.*;
import java.util.Arrays;

public class GreedyAlgo {
    public static void main(String[] args) { // T.C -> O(n)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //if not sorted // T.C -> O(nlogn)
        //sorting 
        // int activitiess[][] = new int[start.length][3];
        // for(int i=0; i<start.length; i++){
        //     activitiess[i][0] = i;
        //     activitiess[i][1] = start[i];
        //     activitiess[i][2] = end[i];
        // }

        // //lambda function -> short form of big function
        // Arrays.sort(activitiess, Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        //1st activity
        maxAct = 1;
        ans.add(0); //ans.add(activitiess[0][0]);
        int lastEnd = end[0]; //int lastEnd = activitiess[0][2];
        for(int i=0; i<end.length; i++){
            if(start[i] >= lastEnd){
                // activity select
                maxAct++;
                ans.add(i); // ans.add(activitiess[i][0]);
                lastEnd = end[i]; // lastEnd = activitiess[i][2];
            }
        }

        System.out.println("max activitiess = "+ maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i) +" ");
        }
        System.out.println();
        
    }
    
}
