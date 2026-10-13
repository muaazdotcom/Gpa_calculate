import java.util.Scanner;
public class Quizes {
    public static void main(String[] args) {
        Float Q1,Q2,Q3,Q4,totalmarks,per,obtmarks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Q1 marks ");
        Q1=sc.nextFloat();
        System.out.println("enter your Q2 marks ");
        Q2=sc.nextFloat();
        System.out.println("enter your Q3 marks ");
        Q3=sc.nextFloat();
        System.out.println("enter your Q4 marks ");
        Q4=sc.nextFloat();
        obtmarks=Q1+Q2+Q3+Q4;
        System.out.println("Enter total marks:");
        totalmarks = sc.nextFloat();
        per=obtmarks/totalmarks*15;
        System.out.println("your obtain marks is "+obtmarks);
        System.out.println("Your quiz marks percentage is " + per);

    }
}