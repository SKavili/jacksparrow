
import java.io.*;
import java.util.*;

public class JackSparrow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acount= scanner.nextInt();
        int bcount= scanner.nextInt();
        int ccount= scanner.nextInt();
        int dcount= scanner.nextInt();
   
        bcount = bcount/2 + bcount%2;  
       
        acount = acount - ccount;

        if (bcount%2==1)    
            acount--;
    
        System.out.println((acount<1 ?0:1 )+bcount+ccount+dcount);
    }
        
}
