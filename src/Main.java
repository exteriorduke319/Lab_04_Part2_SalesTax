import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double initValue;
        double valueWithTax;

        System.out.println("Enter your item's price:");
        initValue = scan.nextDouble();
        valueWithTax = initValue * 1.05;
        System.out.println("Your item's value with tax is $" + valueWithTax);

    }
}