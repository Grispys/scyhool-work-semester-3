import java.util.Scanner;

import java.lang.Math;

public class welcome{

    public static void main(String[] args) {
        int a;
         
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first integer");
            a = input.nextInt();
            if (a == 100)
            {
                System.out.println("That is my favourite number.");
            }
            else{
                System.out.println("aw. That number is just okay.");
            }
        }
        System.out.printf("Entered Integer is %d", a);
        System.out.printf("Integer if pi was involved would be " + (a*Math.PI), a);
        
        
        
        
        
        // int b = 20;
        // float c = 2.5f;
        // int d[] = {1,2,3,4,5};

        // System.out.println("hello!");
        // System.out.printf("%d and %d and %f",a,b,c);
        // System.out.printf("%d or... oh, it's a %d[]", a,d[]);
    }

}