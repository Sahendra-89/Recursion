import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class DuplicateRmove {
    public static void removeDuplicates( String str,int index, StringBuilder newStr, boolean map[]){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam 
        char currChar =str.charAt( index);
        if( map[currChar -'a']==true){
            //duplicate 
            removeDuplicates(str,index+1,newStr, map);
        }else{
            map[currChar -'a']= true;
            removeDuplicates(str,index+1, newStr.append(currChar), map);
        }
    }
    public static int friendsPairing( int n){
        if( n==1 || n==2){
            return n;
        }
    
    // choice 
    //single
    int fnm1 =friendsPairing(n-1);
    //pair
    int fnm2 =friendsPairing(n-2);
    int pairWays = ( n-1)*fnm2;
    //totways
    int totWays = fnm1+pairWays;
    return totWays;
    }
    //Binary string problem (paytem)
    public static void  printBinStrings( int n, int lastPlace,String str){
        // bsae case 
        if(n==0){
            System.out.println( str);
            return;
        }
        /// kaam
        printBinStrings( n-1,0,str+"0");
        if( lastPlace ==0){
            printBinStrings( n-1,1,str+"1");

        }
    }
    public static void main( String args[]){
       printBinStrings( 3, 0 ," "); 
        
    

    }
    
}
    

