import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Formula for Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output result
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
