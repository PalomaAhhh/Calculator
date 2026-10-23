import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();   // geändert
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);   // Dezimalpunkt statt Komma
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("=== Calculator Menu ===");
            System.out.println("1) Basic calculation (+ - * / ^ %)");
            System.out.println("2) Square root");
            System.out.println("3) Factorial");
            System.out.println("4) Average of three numbers");
            System.out.println("5) Percentage");
            System.out.println("6) Hypotenuse");
            System.out.println("7) Circle area");
            System.out.println("8) Show history");
            System.out.println("9) Clear history");
            System.out.println("0) Quit");
            System.out.print("Choose: ");

            try {
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                    System.out.print("First number: ");
                    double a = input.nextDouble();
                    System.out.print("Operator (+, -, *, /, ^, %): ");
                    char op = input.next().charAt(0);
                    System.out.print("Second number: ");
                    double b = input.nextDouble();
                    calc.calculate(a, op, b);
                    break;
                    
                    case 2:
                    System.out.print("Number: ");
                    calc.squareRoot(input.nextDouble());
                    break;
                    
                    case 3:
                    System.out.print("Whole number (0-20): ");
                    calc.factorial(input.nextInt());
                    break;
                    
                    case 4:
                    System.out.print("Three numbers separated by spaces: ");
                    calc.average(input.nextDouble(), input.nextDouble(), input.nextDouble());
                    break;
                    
                    case 5:
                    System.out.print("Value and percent separated by a space: ");
                    calc.percentage(input.nextDouble(), input.nextDouble());
                    break;
                    
                    case 6:
                    System.out.print("Both side lengths separated by a space: ");
                    calc.hypotenuse(input.nextDouble(), input.nextDouble());
                    break;
                    
                    case 7:
                    System.out.print("Radius: ");
                    calc.circleArea(input.nextDouble());
                    break;
                    
                    case 8:
                    calc.showHistory();
                    break;
                    
                    case 9:
                    calc.clearHistory();
                    break;
                    
                    case 0:
                    running = false;
                    System.out.println("Bye,Bye!");
                    break;
                    
                    default:
                    System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
                input.nextLine();
            }
        }
        input.close();
    }
}