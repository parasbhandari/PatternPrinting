// 1. You are given a number n.
// 2. You've to write code to print it's multiplication table up to 10 in format given below.
import java.util.*;
public class pattern5 {
    public static void main(String[] args)
    {
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the number");
     int n= scn.nextInt();
     for(int i=1;i<=10;i++)
     {
        System.out.println( n + " * " + i + " = " + n*i);
     }
    }
    
}
