
import java.util.Scanner;

public class Lab4 {
    static int Accno;
    static String AccHolderName;
    static double Accbal;
    static double transactionAmount;
    static String transactionType;
    static String transactionSummary = "";
    static boolean isAccountCreated = false;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Menu driven program
        int choice=0;
        do{
            System.out.println("____MENU_____");
            System.out.println("1.Create account");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Print transactions");
            System.out.println("5.Print Account Summary");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch(choice){
                case 1:
                    initializeCustomer();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    printTransactions();
                    break;
                case 5:
                    printAccountSummary();
                    break;
                case 6:
                    System.out.println("Thank you for using our services!!!");
                    break;
                default:
                    System.out.println("Invalid choice,please try again!!!");
            }

        }while(choice!=6);
    }

    // to initialize the customer

    public static void initializeCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur acc no: ");
        Accno=input.nextInt();
        input.nextLine();
        System.out.print("Enter the acc holder Name: ");
        AccHolderName=input.nextLine();
        System.out.print("Enter the acc balance: ");
        Accbal=input.nextDouble();
        isAccountCreated = true;
        System.out.println("Account created successfully!!");
    }

    // to deposit money

    public static void depositMoney(){
        Scanner input = new Scanner(System.in);
        if(isAccountCreated){
            System.out.print("Enter the deposit amount:");
            transactionAmount=input.nextDouble();
            Accbal+=transactionAmount;
            transactionType= "Deposit";
            transactionSummary += "\n" + transactionType + "of" + transactionAmount + "done.";
            System.out.println("Deposited successfully");
        }else{
            System.out.println("Please create an account first!");
        }
    }

    // to withdraw money

    public static void withdrawMoney(){
        Scanner input = new Scanner(System.in);
        if(isAccountCreated){
            System.out.print("Enter the withdrawal amount:");
            transactionAmount=input.nextDouble();
            if(transactionAmount>Accbal){
                System.out.println("Insufficient balance!!");
            }else{
                Accbal -= transactionAmount;
                transactionType = "Withdrawal";
                transactionSummary += "\n" + transactionType + "of" + transactionAmount + "done.";
                System.out.println("Withdraw successfully");
            }
        }else{
            System.out.println("Please create an account first!");
        }
    }

    // to print the transactions

    public static void printTransactions(){
        if(isAccountCreated){
            System.out.println("Transaction history: ");
            System.out.println(transactionSummary);
        }else{
            System.out.println("Please create an account first!");
        }
    }

    // to print summary

    public static void printAccountSummary(){
        if(isAccountCreated){
            System.out.println("Account number:"+ Accno);
            System.out.println("Account holder: "+ AccHolderName);
        }
    }

}
