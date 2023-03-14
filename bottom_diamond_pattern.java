import java.util.Scanner;
public class bottom_diamond_pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");

            }
            for(int k=0;k<=a-1-i;k++)
            {
                System.out.print("*" + " ");

            }
            System.out.print("\n");
        }
    }
}
