public class interest {
    
    public static void main (String[] args){
        int []years = {1,2,3,4,5,6,7,8,9,10};
        float money = 1000;
        float interest = 0.05f;
        System.err.println();
        
        
        for(int year:years){
            money = money + (money*interest);
            System.out.printf("%d               %.2f%n", year, money);
        }
    }
}
