import java.util.Scanner;
public class calculator {

    public static void main(String[] args){
        float solution;
        String expression;
        
        Scanner operands_input = new Scanner(System.in);
        System.err.println();
        System.out.printf("Enter TWO numbers: ");
        float x= operands_input.nextFloat();
        float y= operands_input.nextFloat();
        System.out.println("You selected " + x + " and " + y + ".");
        
       
       
       
        Scanner operator_input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your operator (+ - / *): ");
        String operator = operator_input.nextLine();
        System.out.println("you selected: " + operator);
        
        switch (operator) {
            case "-":
                solution = (x-y);
                expression = (x + " - " + y + " = " + solution);
                System.out.println(expression);
                break;
            case "+":
                solution = (x+y);
                expression = (x + " + " + y + " = " + solution);
                System.out.println(expression);
                break;
            case "/":
                solution = (x/y);
                expression = (x + " / " + y + " = " + solution);
                System.out.println(expression);
                break;
            case "*":
                solution = (x*y);
                expression = (x + " * " + y + " = " + solution);
                System.out.println(expression);
                break;
            default:
                break;
        }
        
        
        operator_input.close();
        operands_input.close();
        
    }
    
}