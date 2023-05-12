//Tiling problem

public class Recursion {
    public static int tilingProblem(int n){
        if(n ==0 || n == 1){
            return 1;
        }
        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);            
        }
    }
    public static void main(String args[]){
        // int idx = 0;
        String str = "abcdacdefgfdeh"; 
        int n = 2;
        //System.out.println(tilingProblem(n)); 
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);              
    }
    
}
