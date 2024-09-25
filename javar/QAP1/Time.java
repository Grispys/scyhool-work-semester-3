public class Time {
    // define private variables
    private int hour;
    private int minute;
    private int second;

    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getHour(){
        System.out.println(hour);
        return hour;
    }

    public int getMinute(){
        System.out.println(minute);
        return minute;
    }

    public int getSecond(){
        System.out.println(second);
        return second;
    }


    public void setHour(int hour){
        this.hour = hour;
        System.out.println("hour is now: " +hour);
    }

    public void setMinute(int minute){
        this.minute = minute;
        System.out.println("minute is now: " +minute);
    }

    public void setSecond(int second){
        this.second = second;
        System.out.println("second is now: " +second);
    }

    public String toString(){
        System.out.println("Current time is: " + hour+":"+minute+":"+second);
        return "Current time is: " + hour+":"+minute+":"+second;
    }

    public Time nextSecond(){
        this.second+=1;
        System.out.println("Current time is: " + hour+":"+minute+":"+second);
        return this;
    }

    public Time previousSecond(){
        this.second-=1;
        System.out.println("Current time is: " + hour+":"+minute+":"+second);
        return this;
    }
}
