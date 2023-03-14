import java.util.Scanner;
public class rightside_pattern_of_diamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a=sc.nextInt();
        for(int i=0;i<=a-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        for(int i=a-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
}
