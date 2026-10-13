import java .util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Float A1,A2,A3,A4,totalmarks,per,obtmarks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your A1 marks ");
        A1=sc.nextFloat();
        System.out.println("enter your A2 marks ");
        A2=sc.nextFloat();
        System.out.println("enter your A3 marks ");
        A3=sc.nextFloat();
        System.out.println("enter your A4 marks ");
        A4=sc.nextFloat();
        obtmarks=A1+A2+A3+A4;
        System.out.println("Enter total marks:");
        totalmarks = sc.nextFloat();
        per=obtmarks/totalmarks*15;
        System.out.println("your obtain marks is "+obtmarks);
        System.out.println("Your Assignment  marks percentage is " + per);

    }

}
