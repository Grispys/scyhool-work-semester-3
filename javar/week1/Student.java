public class Student {
    //attributes
    private String name;
    private int age;
    private String bDay;
    private String Program;
    //methords (behaviours)
    

    // public Student() {
    //     this.name = "Nameless";
    //     this.age = 18;
    //     this.Program = "SD";
    //     this.bDay = "1999-99-99";
    // }
 
    
    public void set(String name, int age, String bDay, String Program){
        this.name = name;
        this.age = age;
        this.bDay = bDay;
        this.Program = Program;

    }

    

    public void display()
    {
        System.out.println(this.name + this.age + this.bDay + this.Program);

    }
}
