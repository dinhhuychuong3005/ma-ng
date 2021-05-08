import java.util.Scanner;

public class cTof {
    public static void main(String[] args) {
        double f,c;
        int choice = -1;
        Scanner sc = new Scanner(System.in);
while (choice != 0){
    System.out.println("Menu.");
    System.out.println("1. Fahrenheit to Celsius");
    System.out.println("2. Celsius to Fahrenheit");
    System.out.println("0. Exit");
    System.out.println("Enter your choice: ");
    choice = sc.nextInt();
    switch (choice){
        case 1:
            System.out.println("Enter Fahrenheit:");
            f = sc.nextDouble();
            c = (5.0 / 9) * (f - 32);
            System.out.println("Fahrenheit to Celsius: " + c);
            break;
        case 2:
            System.out.println("Enter Celsius");
            c = sc.nextDouble();
            f = (9.0 / 5) * c + 32;
            System.out.println("Celsius to Fahrenheit:" + f);
            break;
        case 0:
            System.exit(0);
        default:
            System.out.println("No choice!");
    }
}
    }
}
