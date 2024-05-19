import java.util.Scanner;

public class ATM {
    public BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    public void withdraw(){
        System.out.println("amount withdraw= ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        withdraw(amount);
    }


    public void deposit() {
        System.out.println("amount deposit=  ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        deposit(amount);
    }


    private void withdraw(int amount) {
        if (bankAccount.getBalance() < amount) {
            System.out.println("Insufficient funds");
        }
        else
        {

        bankAccount.withdraw(amount);
        System.out.println(" Withdraw Sucessfully "+amount);
        }
    }
    private void deposit(int amount) {
        bankAccount.deposit(amount);
        System.out.println(" Deposited Sucessfully "+amount);
    }

    private void checkBalance() {
        System.out.println("Your account balance is: "+bankAccount.getBalance());
    }

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(5000);
        ATM atm = new ATM(bankAccount);

        int choice;
        Scanner scanner = new Scanner(System.in);
        do
        {
        System.out.println("ATM application");
        System.out.println("1 deposit");
        System.out.println("2 withdraw");
        System.out.println("3 checkbalance");
        System.out.println("4 exit");

        System.out.println("Please enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
            	atm.deposit();
                break;
            case 2:
            	atm.withdraw();
                break;
            case 3:
            	atm.checkBalance();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        	}
        
        }while(choice!=4);
        scanner.close();
    }
 
}