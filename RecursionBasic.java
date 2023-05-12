public class RecursionBasic {
    public static void printDec(int n){
        if(n==0){
            return;
        }
        printDec(n-1);
        System.out.print(n+ " ");
        
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }
    public static int sumCal(int n){
        if(n==1){
            return 1;
        }
        int sn = sumCal(n-1);
        int sum = n+sn;
        return sum;
        
    }
    public static void printFib(int a, int b, int n) {
        if(n == 0) {
        return;
        }
        System.out.print(a +" ");
        printFib(b, a+b, n-1);
    } 
    public static boolean sorted(int arr[], int i) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sorted(arr, i+1);
    }
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    
    public static int pow(int x, int n){//Time Complexity O(n)
        if(n == 0){
            return 1;
        }

        return x*pow(x,n-1);

    }

    public static int power(int a, int n){//Time Complexity O(log n)
        if(n == 0){
            return 1;
        }

        int halfPower = power(a,n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is Odd
        if(n != 0){
            halfPowerSq = a*halfPowerSq; 
        }

        return halfPowerSq;

    }
    public static void main(String args[]){
        int n = 8;
        int x = 5;
        // int arr[] = {1, 2, 5, 4, 5};
        // int i = 0;
        // int key = 5;
        int a=0;
        int b=1;
        // int n=10;
        //System.out.println(sumCal(n));
        //System.out.println(pow(n,x));
        printFib(a,b,8);
                
    }
    
}
