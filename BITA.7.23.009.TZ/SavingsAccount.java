public class SavingsAccount{
    private double savingBalance;
    private static  double annualInterestRate;
    public SavingsAccount(double savingBalance){
        this.savingBalance=savingBalance;
    }
    public void setannualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public void MonthlyInterest(){
        savingBalance=savingBalance*annualInterestRate/12+savingBalance;
    }
    public double getBalance(){
        return savingBalance;
    }
}