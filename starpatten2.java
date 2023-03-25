// 1	
// 2	3	
// 4	5	6	
// 7	8	9	10	
// 11	12	13	14	15
import java.util.*;
public class starpatten2 {
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= scn.nextInt();
        int i,j,k;
        k=1;
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=rows;j++)
            {
                if(j<=i)
                {
                    System.out.print(k);
                    System.out.print("\t");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
