public class AccountTest{
    public static void main(String[]args){
        Account account1=new Account(2000);
        Account account2=new Account(5000);
        account1.credit(2000);
        account2.debit(3000);
        System.out.println("account 1 balance " + account1.getBalance());
        System.out.println("account 2 balance " + account2.getBalance());
    }
}