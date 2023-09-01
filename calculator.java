
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Calculator ");
        System.out.println("Enter two numbers:");

       double  num1 = scanner.nextDouble();
       double num2 = scanner.nextDouble();
       System.out.println("Select an operation (+, -, *, /):");
       char operation = scanner.next().charAt(0);
       double result = 0;
       switch(operation)
       {
        case '+' : result = num1+num2;
        break;
        case '-' : result = num1-num2;
        break;
         case '*' : result = num1*num2;
        break;
         case '/' :if (num2 != 0) { result = num1/num2;
         }
         else{
            System.out.println("invalid number");
         }
        break;
        default : System.out.println("invalid number");
        System.exit(1);



       }
       System.out.println("Result: " + result);
       scanner.close();

        
    }
}
