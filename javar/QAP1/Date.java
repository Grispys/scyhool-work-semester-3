public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        System.out.println(day);
        return day;
    }

    public int getMonth(){
        System.out.println(month);
        return month;
    }

    public int getYear(){
        System.out.println(year);
        return year;
    }

    public void setDay(int day){
        this.day = day;
        System.out.println("Day is now: " + day);
    }

    public void setMonth(int month){
        this.month = month;
        System.out.println("Month is now: " + month);
    }

    public void setYear(int year){
        this.year = year;
        System.out.println("Year is now: " + year);
    }

    public void setDate(int day, int month, int year){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("The date is now: " + day +"/"+month+"/"+year);
    }

    public String toString(){
        System.err.println("Date: "+ day+"/"+month+"/"+year);
        return "Date: "+ day+"/"+month+"/"+year;
        
    }
}
