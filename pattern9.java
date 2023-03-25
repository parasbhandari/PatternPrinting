// *	*	*	*	*	*	*	
// 	*				    *	
// 		*		   *	
// 			*	
// 		*	*	*	
// 	*	*	*	*   *	
// *	*	*	*	*	*	*	
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=scn.nextInt();
        int i,j;
        for(i=1;i<=rows;i++)
        {
            if(i==1 || i==rows)
            {
                for(j=1;j<=rows;j++)
                System.out.print("*\t");
            }
            else{
                if(i<=rows/2+1)
                {
                    for(j=1;j<=rows;j++)
                    {
                        if(j==i || j==rows+1-i)
                        System.out.print("*\t");
                        else
                        System.out.print("\t");
                    }
                }
                else{
                    for(j=1;j<=rows;j++)
                    {
                        if(j>=rows+1-i && j<=i)
                        {
                            System.out.print("*\t");
                        }
                        else
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
