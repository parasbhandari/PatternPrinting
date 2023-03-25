//        *	
//        *	  *	
//  *  *  *	  *	  *		
//        *   *		
//        *   
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= scn.nextInt();
        int i,j,space,star;
        space=rows/2;
        star=1;
        for(i=1;i<=rows;i++)
        {
            if(i==space+1)
            {
                for(j=1;j<=space;j++)
                System.out.print("*\t");
            }
            
            for(j=1;j<=space;j++)
            {
                if(i!=space+1)
                System.out.print("\t");
    
            }
            for(j=1;j<=star;j++)
            {
                System.out.print("*\t");
            }
            if(i<=rows/2)
             star++;
            else 
            star--;
            System.out.println();
        }
    }
    
}
