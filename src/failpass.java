import java.util.Scanner;
public class failpass {
    public static void main(String[] args) {
        int Marks;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks :");
        Marks=sc.nextInt();
        if(Marks>=50 && Marks<=100)
        {
            System.out.println("pass");
        }
        if(Marks <=49 && Marks>=0)
        {
            System.out.println("fail");
        }

    }
}
