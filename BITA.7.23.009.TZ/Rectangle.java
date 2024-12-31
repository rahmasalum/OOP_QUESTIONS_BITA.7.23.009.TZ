public class Rectangle{
    private double length;
    private double width;
    public Rectangle(double length,double width){   
        if(length<0.0 && length>20.0){
            this.length=0;
            System.out.println("invalid value");
        }
        else{
            this.length=length;
        }
        if(width<0.0 && width>20.0){
            this.width=0;
            System.out.println("invalid value");
        }
        else{
            this.width=width;
        } 
        }      
public void setlength(int length){
        if (length<0.0 && length>20.0) {
        this.length=0;
        System.out.println("invalid value");
    }
    else{
        this.length=length; 
    }
}
public void setwidth(int width){
    if (width<0.0 && width>20.0){
        this.width=0;
        System.out.println("invalid value");    
    }
    else{
        this.width=width;
    }
}
public double AreaOfRectangle(){
    return length * width;
}
public double PerimeterOfRectangle(){
    return 2*(length+width);
}
public double getlength(){
        return this.length;
}
public double getwidth(){
        return this.width;
}
}
