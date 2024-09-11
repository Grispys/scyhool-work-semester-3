package javar.week2;

public class rectangle {
    // attributes
    private float length = 1.0f;
    private float width = 1.0f;
    //constructors
    // no argument constructor 
    public rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public rectangle(float l, float w){
        this.length = l;
        this.width = w;  
    }


    
    //methods
    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length = length;
    }



    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }



    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length *2) + (this.width *2);
    }



    public String toString(){
        return("Rectangle L = (" + this.length + "," + this.width + ")");
    }




    public void display(){
        System.out.println(this.length + "," + this.width);
    }



}   
