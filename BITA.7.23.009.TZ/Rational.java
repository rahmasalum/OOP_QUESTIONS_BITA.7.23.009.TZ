public class Rational{
    private int numerator;
    private int denominator;
    public Rational(){
        this.numerator=1;
        this.denominator=2;
    }
    public Rational(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public void addRational(Rational other){
        this.numerator=this.numerator*other.denominator+other.numerator*this.denominator;
        this.denominator=this.denominator*other.denominator;
    }
     public void subRational(Rational other){
        this.numerator=this.numerator*other.denominator-other.numerator*this.denominator;
        this.denominator=this.denominator*other.denominator;
    }
     public void multRational(Rational other){
        this.numerator=this.numerator*other.numerator;
        this.denominator=this.denominator*other.denominator;
    }
     public void divRational(Rational other){
        this.numerator=this.numerator*other.denominator;
        this.denominator=this.denominator*other.numerator;
    }
    public String Printing(){
        return numerator + "/" + denominator;
    }
    public double Printingf(){
        return numerator/denominator;
    }
    
    }
