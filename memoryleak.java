public class memoryleak {
    
    public static void main(String[] args){
        int a = 0;

        while (a<2_000_000_000){
            a+=1;
            if (a>=2_000_000_000){
                System.out.println("we hit 2 billion.");
                break;
            }
        }
    } 
}
