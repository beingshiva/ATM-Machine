import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 2565;

    public void checkpin() {
        System.out.print("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enterIN = sc.nextInt();

        if (enterIN == PIN) {
            
            menu();
           
        } else {
            System.out.println("Enter a valid PIN...!");
            checkpin();
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("--------------- Our Services ---------------");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter Your Choice : ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            System.out.println("--------------- Thankyou for connecting with us...!  ---------------");
            return;
        } else{
            System.out.println("Enter a valid Choice...!");
        }

    }

    //To Check Balance Option
    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        System.out.println();
        menu();
    }

    // To withdraw Money Option
    public void withdrawMoney(){
        System.out.print("Enter the Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount>Balance){
            System.out.println("Insufficient Balance...!");
            menu();
        } else{
            Balance = Balance - amount;
            System.out.println("Money withdrawal Successful...!");
            menu();

        }
    }

    // TO deposit money Option
    public void depositMoney(){
        System.out.print("Enter the Amount to Deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount < 0){
            System.out.println("Invalid Input...!");
            menu();
        } else{
            Balance = Balance + amount;
            System.out.println("Money Deposited Successfully...!");
            menu();
        }
    }
}

public class ATMMachine {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("<--------------- Welcome to +1 ATM Machine Project --------------->");
        System.out.println();
        System.out.println();
        ATM obj = new ATM();
        obj.checkpin();
    }
}