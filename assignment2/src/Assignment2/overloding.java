package Assignment2;
import java.util.Scanner;

public class overloding {
    private double number1;
    private double number2;

   
    public overloding() {
        this.number1 = 0;
        this.number2 = 0;
    }

   
    public overloding(double number1) {
        this.number1 = number1;
        this.number2 = 0;
    }

    
    public overloding(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    
    public double add() {
        return this.number1 + this.number2;
    }

   
    public double add(double num1, double num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number for calc1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number for calc1: ");
        double num2 = scanner.nextDouble();
        overloding calc1 = new overloding(num1, num2);

        System.out.print("Enter a number for calc2 (only one number): ");
        double num3 = scanner.nextDouble();
        overloding calc2 = new overloding(num3);

        overloding calc3 = new overloding(); 

        System.out.println("\ncalc1 add (two parameters): " + calc1.add());
        System.out.println("calc2 add (one parameter, second is default): " + calc2.add());
        System.out.println("calc3 add (default values): " + calc3.add());
        
        System.out.print("\nEnter two numbers for addition (num1 and num2): ");
        double addNum1 = scanner.nextDouble();
        double addNum2 = scanner.nextDouble();
        System.out.println("calc1 add (method with parameters): " + calc1.add(addNum1, addNum2));

        scanner.close();
    }
}
