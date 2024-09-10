public class counter {
    
    public static void main(String[] args){
        int a = 0;

        while (a>-999){
            a-=1;
            System.out.println(a);
            if (a<=-999){
                System.err.println();
                System.out.println("Counting complete.");
                int sum;
                int avg;
                sum = -(a*(a+1))/2;
                avg = (sum/-999);
                System.out.println("the sum is " + sum);
                System.out.println("the average is " + -avg);
                break;
            }
        }
    } 
}
