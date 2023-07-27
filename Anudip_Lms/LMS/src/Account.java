import java.util.Scanner;
public class Account {
    public static void main(String[] args) {
        CheckingAccount obj=new CheckingAccount();
        obj.deposit(10000);
        obj.withdraw(4000);
    }
}
interface BankAccount{
    void deposit(int amount);
    void withdraw(int withdraw_amount);
}
class CheckingAccount implements BankAccount{
    int amount;
    int withdraw_amount;
    int balance;
    Scanner input=new Scanner(System.in);
    public void deposit(int amount){
         balance += amount;
        System.out.println("The deposit money :"+balance);
    }
    public void withdraw(int withdraw_amount){
         if(balance > withdraw_amount)
         {
             balance-=withdraw_amount;
             System.out.println("The withdraw money :"+withdraw_amount);
         }
         else
         {
             System.out.println("Sorry Insufficient Balance");
         }
    }
}