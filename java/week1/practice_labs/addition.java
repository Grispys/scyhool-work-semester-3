import java.util.Scanner;

public class addition {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.err.println();
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.printf("The sum is %d\n", sum);
        input.close();

        
    }
}


