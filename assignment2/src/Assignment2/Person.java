package Assignment2;

import java.util.Scanner;

import java.util.Scanner;

	public class Person {
    private String name;
    private int age;

      public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  

        Person person1 = new Person(name, age);

        boolean continueOperations = true;
        while (continueOperations) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Display Name");
            System.out.println("2. Display Age");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    person1.displayName();
                    break;
                case 2:
                    person1.displayAge();
                    break;
                case 3:
                    person1.displayDetails();
                    break;
                case 4:
                    continueOperations = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (continueOperations) {
                System.out.print("\nDo you want to perform another operation? (yes/no): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    continueOperations = false;
                }
            }
        }

        System.out.println("Program ended.");
        scanner.close();
    }
}


