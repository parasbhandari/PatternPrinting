// 1				        1	
// 1	2			    2	1	
// 1	2	3	   3	2	1	
// 1	2	3   4  3	2	1	
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int rows= scn.nextInt();
    int i,j,k;
    k=0;
    for(i=1;i<=rows;i++)
    {
        if(i!=rows){
            k=i;
        for(j=1;j<=rows;j++)
        {
            if(j<=i)
            {
            System.out.print(j);
            }
           System.out.print("\t");
        }
        for(j=rows+1;j<=2*rows-1;j++)
        {
            if(j>=2*rows-i)
            {
                System.out.print(k+"\t");
                k--;
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
    else{
        int l=0;
        for(j=1;j<=2*rows-1;j++)
        {
            if(j>rows)
            {
                l=l+2;
                System.out.print(j-l+"\t");
            }
            else{
            System.out.print(j+"\t");
            }
            
        }
    }
    
    }


    }
}
