public class greatestNum {
    
    public static void main (String[] args){
        int []numbers = {1,4,10,2,0};
        System.err.println();
        int max = numbers[0];
        for (int num:numbers){
            if(num > max){
                max = num;
            }
        }

        System.out.println("The highest integer is " + max);
    }
}

