public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
           return;

        }
        System.out.print(n + " ");
        printDec(n - 1);
    }
    public static   void  printInc( int n){
        if( n==1){
            System.out.print( n+ " ");
            return ;
        }
        printInc( n - 1);
        System.out.print(n+" ");
    } 
    public static int fact( int n){
        if(  n == 0){
            return 1;
    }
        int fnm1  = fact( n-1);
        int fn = n*fact( n-1);
        return fn;

}
public static int calcSum( int n){
    if( n==1){
        return 1;
    }
    int Sum1 = calcSum( n-1);
    int Sn = n+ Sum1;
    return Sn;
}
// calculate nth term fibonacci
public static  int fib(int n){
    if( n==0|| n==1){
        return n;
    }
    int fnm1 = fib(n-1);
    int fnm2 = fib( n-2);
    int fn=fnm1+fnm2;
    return fn;
}
public static boolean isSorted( int arr[],int i){
    if( i ==arr.length-1){
        return true;
    }
    if( arr[i]>arr[i+1]){
        return false;
    }
    return isSorted(arr,i+1);
}
public static int firstOccurance( int arr[],int key, int i){
    if( i==arr.length){
        return -1;
    }
    if( arr[i]==key){
        return i;
    }
    return firstOccurance(arr,key, i+1);
}
public static  int lastOccurance( int arr[], int key, int i){
    if( i==arr.length){
        return -1;
    }
    int isFound =lastOccurance( arr , key, i+1);
    if( isFound == -1 && arr[i]== key){
        return i;
    }
    return isFound;

}
public static int power( int x, int n){
    if( n==0){
        return 1;
    }
    return x*power( x, n-1);
}


    public static void main(String args[]) {
        
        System.out.println( power(2,10));
        
    }
}
