public class AmountTest{
   public static void main(String[]args){   
        Amount amount=new Amount(5,5);
        System.out.println("Totak Amount"+amount.totalAmount()); 
    amount.setQuantity(10);
    System.out.println("Totak Amount"+amount.totalAmount());
    Amount amount2=new Amount(-2,5);
    System.out.println("TOtal amount " + amount2.totalAmount());
    amount2.resetAll(40,12);
    System.out.println("TOtal amount " + amount2.totalAmount());
    Sytem.out.println("the Quantity is " + amount.getQuantity);// + " and price is " + amount2.getPrice() + " the total amount is " + amount2.totalAmount());
 }
}