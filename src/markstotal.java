import java.util.Scanner;
public class markstotal {
   public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       Float CP,Quizes,Assignment,mids,finals,total;
       System.out.print("enter the marks of CP:");
       CP=sc.nextFloat();
       System.out.print("enter the marks of Quiz :");
       Quizes=sc.nextFloat();
       System.out.print("enter the marks of Assignment marks:");
       Assignment =sc.nextFloat();
       System.out.print("enter the marks of mids marks:");
       mids=sc.nextFloat();
       System.out.print("enter the marks of finals marks :");
       finals =sc.nextFloat();
       total=CP+Quizes+Assignment+mids+finals;
       System.out.println("Your total marks is :" +total);

   }
}
