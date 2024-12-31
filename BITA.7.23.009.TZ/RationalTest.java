public class RationalTest{
    public static void main(String[]args){
        Rational rational=new Rational(2,5);
        Rational rational2=new Rational(4,7);
         
        rational.addRational(rational2);
        System.out.println("in fraction " + rational.Printing());       
        System.out.println("in fraction in float " + rational.Printingf());       
        rational.subRational(rational2);
        System.out.println("in fraction " + rational.Printing());       
        System.out.println("in fraction in float " + rational.Printingf());       
        rational.multRational(rational2);
        System.out.println("in fraction " + rational.Printing());       
        System.out.println("in fraction in float " + rational.Printingf());       
        rational.divRational(rational2);
        System.out.println("in fraction " + rational.Printing());       
        System.out.println("in fraction in float " + rational.Printingf());       
            
    }
}