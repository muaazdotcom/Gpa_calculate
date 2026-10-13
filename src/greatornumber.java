import java.util.Scanner;
public class greatornumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A,B,C;
        System.out.print("Enter first number :");
        A=sc.nextInt();
        System.out.print("Enter second number:");
        B=sc.nextInt();
        System.out.print("Enter the third number :");
        C=sc.nextInt();
        if(A>=B && A>=C)
        {
            System.out.println("A is greatest number ");
        }
        if(B>=A && B>=C)
        {
            System.out.println("B is greatest number ");
        }
        if(C>=A && C>=B)
        {
            System.out.println("C is greatest number ");
        }

    }
}
