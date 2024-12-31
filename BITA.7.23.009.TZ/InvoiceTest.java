public class InvoiceTest{
    public static void main(String[] args){
        Invoice invoice=new Invoice("Part 1","car",4,20000);
        System.out.println("total amount " + invoice.getAmount());
        invoice.setPrice(30000);
        invoice.setQuantity(-5);
        System.out.println("total amount " + invoice.getAmount());
    }
}