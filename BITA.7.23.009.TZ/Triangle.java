public class Triangle{
    private int a;
    private int b;
    private int c;
    public Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public boolean isTriangle(){
        return a>=0 && b>=0 && c>=0 && a+b>c && a+c>b && b+c>a;
    }
    public double getArea(){
        if(isTriangle()){
            return 0.5*(a*b);
        }else{
            return 0;
        }   
    }
}