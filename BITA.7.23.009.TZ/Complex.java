public class Complex{
    private double realPart;
    private double imaginaryPart;
    public Complex(double realPart,double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    public void addComplex(double realPart,double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
     public void subComplex(double realPart,double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    public double ComplexNumber(){
        return  realPart+imaginaryPart;
    }
}