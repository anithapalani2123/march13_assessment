# march13_assessment
## Name:ANITHA.P
## Register Number:212221240004
### 1.print the square pattern.
```java
import java.util.Scanner;
public class square_pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
```
##output:

![ss1](https://user-images.githubusercontent.com/94184990/224886405-18ebf700-6b54-41c9-a408-d596e683a039.png)

### 2.print the Iverted Pyramid pattern.
```java
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

```
## output:

![ss2](https://user-images.githubusercontent.com/94184990/224886463-3556a4cc-2b6b-4118-96ee-8bc9beed8d29.png)

### 3. print the right side pattern of Diamond.
```java
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

```
## output:
![ss3](https://user-images.githubusercontent.com/94184990/224886538-1866f70d-2e7e-4474-a380-f4fd00d766ca.png)


