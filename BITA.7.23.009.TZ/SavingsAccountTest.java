public class SavingsAccountTest{
    public static void main(String[]args){
        SavingsAccount server1=new SavingsAccount(2000.00);
        SavingsAccount server2=new SavingsAccount(3000.00);
        server1.setannualInterestRate(0.04);
        server2.setannualInterestRate(0.04);
        server1.MonthlyInterest();
        server2.MonthlyInterest();
        System.out.println("server1 is " + server1.getBalance());
        System.out.println("server2 is " + server2.getBalance());
    }
}