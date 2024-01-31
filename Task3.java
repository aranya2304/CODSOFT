import java.util.Scanner;
class UserBankAccount{
    
    private double balance;
    public UserBankAccount(double initialBalance){
        this.balance=initialBalance;
    }

    public boolean withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            return true;
        }
        else{
            return false;
        }
    }

    public void deposit(double amount){
            balance+=amount;
        }

    public double checkBalance(){
            return balance;
        }
    }

class ATM{

    private UserBankAccount useraccount;

    public ATM(UserBankAccount account){
        this.useraccount=account;
    }

    private void withdraw(Scanner s){
        System.out.println("Enter the amount to be withdrawn:");
        double amount=s.nextDouble();
        if(useraccount.withdraw(amount)){
            System.out.println("Withdrawal Complete. Remaining balance: "+useraccount.checkBalance());
        }
        else{
            System.out.println("Withdrawal unsuccessful. Insufficient balance or invalid input");
        }

    }
    
    private void deposit(Scanner s){
        System.out.println("Enter the amount to be deposited:");
        double amount=s.nextDouble();
        useraccount.deposit(amount);
        System.out.println("Deposit Complete. New balance: "+useraccount.checkBalance());
    }

    private void checkBalance(){
        System.out.println("Total balance: "+useraccount.checkBalance());
    }

    public void displayOptions(){
        System.out.println("ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void pressOption(int option, Scanner s){
        switch(option){
            case 1:withdraw(s);
            break;
            case 2:deposit(s);
            break;
            case 3:checkBalance();
            break;
            case 4:System.out.println("Thankyou");
            break;
            default: System.out.println("Warning: Invalid input!");
        }
    }
}   

public class Task3{

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        UserBankAccount useraccount=new UserBankAccount(10000);

        ATM atm=new ATM(useraccount);

        int option;
        do{
            atm.displayOptions();
            System.out.println("Enter one option:(1-4)");
            option=s.nextInt();
            atm.pressOption(option,s);
        }while(option!=4);
        s.close();
    }
}
    
    