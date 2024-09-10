import java.util.Scanner;

public class numWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int digit;
        System.err.println();
        System.out.println("Enter a single digit number: ");
        digit = input.nextInt();
        
        if(digit==0){
            System.out.println("ZERO");
        }
        else if(digit==1){
            System.out.println("ONE");
        }else if(digit==2){
            System.out.println("TWO");
        }else if(digit==3){
            System.out.println("THREE");
        }else if(digit==4){
            System.out.println("FOUR");
        }else if(digit==5){
            System.out.println("FIVE");
        }else if(digit==6){
            System.out.println("SIX");
        }else if(digit==7){
            System.out.println("SEVEN");
        }else if(digit==8){
            System.out.println("EIGHT");
        }else if(digit==9){
            System.out.println("NINE");
        }else{
            System.err.println("Invalid number!");
        }
        input.close();
    }
}
