import java.util.Scanner;
public class star_pattern
  {
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      System.out.print("enter the value of n:"+n);
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
            {
              System.out.print("*");
            }
          System.out.println();
        }  
    }
  }  
