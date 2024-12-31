public class Account{
    private int initialBalance;
    public Account( int initialBalance){
        if(initialBalance<=0){
            this.initialBalance=0;
            System.out.println("invalid value");
        }else{
            this.initialBalance=initialBalance;
        }
    }
    public int getBalance(){
        return initialBalance;
    }
    public void credit(int add){
        this.initialBalance+=add;
    }
    public void debit(int withdraw){
        if(withdraw>initialBalance){   
        System.out.println("DEbit amount axceeded account Balance");
        }else{   
        this.initialBalance-=withdraw;
        }
    }

}