import java.util.Scanner;
public class currencywithfunctions {
    public static int currency() {
        // taking amount
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount :");
        int amount = sc.nextInt();
        return amount;
    }

    public static void Amount(int amount) {
        //calculation
        int fivethousand = amount / 5000;
        amount = amount % 5000;
        int onethousand = amount / 1000;
        amount = amount % 1000;
        int fivehundred = amount / 500;
        amount = amount % 500;
        int hundred = amount / 100;
        amount = amount % 100;
        int fifty = amount / 50;
        amount = amount % 50;
        int twenty = amount / 20;
        amount = amount % 20;
        int ten = amount / 10;
        amount = amount % 10;
        //prints
        System.out.println("5000 notes are : " + fivethousand);
        System.out.println("1000 notes: " + onethousand);
        System.out.println("500 notes: " + fivehundred);
        System.out.println("100 notes: " + hundred);
        System.out.println("50 notes: " +fifty );
        System.out.println("20 notes: " + twenty);
        System.out.println("10 notes: " + ten);
        System.out.println("remaining amount : " + amount);

    }

   public static void main(String[] args) {

      int amount=  currency();
        Amount(amount);

    }
}