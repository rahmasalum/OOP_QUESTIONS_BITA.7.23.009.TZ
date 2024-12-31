public class Amount{
    private int Quantity;
    private int Price;
    public Amount(int Quantity, int Price){
        if (Quantity<0){
            this.Quantity=0;
            System.out.println("invalid Quantity");
        }
        else{
           this.Quantity=Quantity; 
        }
        if (Price<0){
            this.Price=0;
            System.out.println("invalid Price");    
        }
        else{
            this.Price=Price;
        }
    }
   
    public void resetAll(int Quantity,int Price){
       
        if (Quantity<0){
            this.Quantity=0;
            System.out.println("invalid Quantity");
        }
        else{
           this.Quantity=Quantity; 
        }
        if (Price<0){
            this.Price=0;
            System.out.println("invalid Price");    
        }
        else{
            this.Price=Price;
        }
    }
    public void setQuantity(int Quantity){
          if (Quantity<0){
            this.Quantity=0;
            System.out.println("invalid Quantity");
        }
        else{
           this.Quantity=Quantity; 
        }
    }
    public void setPrice(int Price){
        if (Price<0){
            this.Price=0;
            System.out.println("invalid Price");    
        }
        else{
            this.Price=Price;
        }
    }
     public int totalAmount(){
        return Quantity * Price;
    }
    public int getQuantity(){
        return this.Quantity;
    }
        public int getPrice(){
        return this.Price;
        }
}