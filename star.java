//     *	
//   *	  *	
// *		*	
//   *	  *	
//     *	

import java.util.*;

public class star{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int rows= scn.nextInt();
     int i,j,h,l;
     l=(rows+1)/2;
     h=(rows+1)/2;
     for(i=1;i<=rows;i++)
     {
         for(j=1;j<=rows;j++)
         {
             if(j==l || j==h)
             {
                 System.out.print("*\t");
             }
             else {
                 System.out.print("\t");
             }
         }
         System.out.println();
         if(i<(rows+1)/2)
         {
             l--;
             h++;
         }
         else
         {
             l++;
             h--;
         }
     }

 }
}