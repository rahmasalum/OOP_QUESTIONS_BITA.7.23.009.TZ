public class Invoice{
    private String PartNo;
    private String PartDes;
    private int Quantity;
    private int Price;
    public Invoice(String PartNo,String PartDes,int Quantity,int Price){
        if (Quantity<0){
            this.Quantity=0;
        }else{
            this.Quantity=Quantity;
        }
        if (Price<0){
            this.Price=0;
        }else{
            this.Price=Price;
        }
        this.PartNo=PartNo;
        this.PartDes=PartDes;
    }
    public void setQuantity(int Quantity){
        if (Quantity<0){
            this.Quantity=0;
        }else{
            this.Quantity=Quantity;
        }
    }
      public void setPrice(int Price){
        if (Price<0){
            this.Price=0;
        }else{
            this.Price=Price;
        }
    }
public void setPartNo(String PartNO){
    this.PartNo=PartNo;
}
public void setPartDes(String PartDes){
    this.PartDes=PartDes;
}
public int getQuantity(){
    return Quantity;
}
public int getPrice(){
    return Price;
}
public String getPartNo(){
    return PartNo;
}
public String getPartDes(){
    return PartDes;
}
public int getAmount(){
    return Quantity*Price;
}
}