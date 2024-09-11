package javar.week2;

public class Demo {

    public static void main(String[] args){
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        rectangle r3 = new rectangle(3,1);
        rectangle r4 = new rectangle(2,4);
        rectangle r5 = new rectangle();
        rectangle r6 = new rectangle(13513,29);

        System.err.println();
        System.out.println(r3.getLength());
        r6.setLength(300);
        r6.display();

        System.out.println(r4.getArea());
    }
}
