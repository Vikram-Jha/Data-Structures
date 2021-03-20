import java.util.*;

public class Star_Pattern {
    public static void main(String[] args) {
        /*  *
            **
            ***
            ****
            ***** */
        
            // for(int i = 1; i <= 5 ; i++){
            //     for (int j = 1; j <=i; j++) {
            //         System.out.print("* "); 
            //     }
            //     System.out.println(); 
            // }
            

/*      *
        * * *
        * * * * *
        * * * * * * *
        * * * * * * * * */

        // for(int i = 1; i <= 9 ; i=i+2){ // Decides no of columns
        //     for (int j = 1; j <=i; j++)  // Decides no of rows
        //         System.out.print("* "); 
        // System.out.println(); 
        // }
 /* 
            *
          * *
        * * *
      * * * *
    * * * * *
 */

        // for(int i = 1; i <= 5 ; i++){
            // for(int j=1;j<=5-i;j++)
            //     System.out.print("  ");
        //     for (int j = 1; j <=i; j++)
        //         System.out.print("* "); 
        //     System.out.println(); 
        // }
/* 
                  *
              * * *
          * * * * *
      * * * * * * *
* * * * * * * * * *
  */
  for(int i = 1; i <= 9 ; i=i+2){ // Decides no of columns
    for(int j=1;j<=9-i;j++)
        System.out.print("  ");
    for (int j = 1; j <=i; j++)  // Decides no of rows
        System.out.print("* "); 
    System.out.println(); 
    }

/*
    *
   ***
  *****
 *******
*********
 */
   



    }
}