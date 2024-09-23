public class TestTime {

    public static void main(String[] args){
        Time t1 = new Time(15, 10, 21);
        Time t2 = new Time(25, 20, 10);
        System.out.println();
        System.out.println();


        t1.nextSecond();
        t2.previousSecond();
    }
}
