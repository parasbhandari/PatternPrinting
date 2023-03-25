//          1	
//      2	3	2	
//   3	4	5	4  3	
//      2	3	2	
//          1	
import java.util.Scanner;
public class pattern6 {
public static void main(String[] args)
{
 Scanner scn = new Scanner(System.in);
 int rows= scn.nextInt();
 int i,j,k;
 int h=0;
 int l=(rows+1)/2;
 k=-1;
 for(i=1;i<=rows;i++)
 {
    if(i<=l)
    {
        k++;
    }
    else{
        k--;
    }
    h=k;
    for(j=1;j<=rows;j++)
    {
        if(j>=l-k && j<=l+k)
        {
         if(j<=l)
         {
            h++;
         }
         else{
            h--;
         }
          System.out.print( h + "\t");
          

        }
        else{
            System.out.print("\t");
        }
    }
    System.out.println();
 }
}    
}
