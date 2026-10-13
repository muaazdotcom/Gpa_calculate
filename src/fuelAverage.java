import java.util.Scanner;
public class fuelAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // distance covered
        System.out.print("Enter total distance: ");
        double distance = sc.nextDouble();
        //liters consumed
        System.out.print("Enter total liters: ");
        double liters = sc.nextDouble();
        //calculations
        double Average = distance / liters;
        // prints
        System.out.printf("Average = %.2f%n",Average);

    }
}
