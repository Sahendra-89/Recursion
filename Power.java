public class Power {
    public static int optimizedPower( int a, int n){
        if( n==0){
            return 1;
        }
        int halfpowerSq =optimizedPower( a, n/2)*optimizedPower( a, n/2);
        // if n is odd 
        if( n%2 !=0){
            halfpowerSq = a * halfpowerSq;

        }
        return halfpowerSq;
    }
    public static void removeDuplicates( String str,int indx, StringBuilder newStr, boolean map[]){
        if( indx ==str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam 
        char currChar =str.charAt( indx);
        if( map[currChar -'a']==true){
            //duplicate 
            removeDuplicates(str,indx+1,newStr, map);
        }else{
            map[currChar -'a']= true;
            removeDuplicates(str,indx+1, newStr.append(currChar), map);
        }
    }
    public static void main( String args[]){
        String str ="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(" "), new boolean [26]);
    }
    
}
