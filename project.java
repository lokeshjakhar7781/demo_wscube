import java.util.*;
public class project {
    static int balance = 10000;
        static int menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("----------Welcome to ATM----------");
            System.out.println();
            System.out.println("Now insert your card in ATM machine");
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            System.out.println();
            return(ch);
        }
        static void withdraw() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Withdrawn Operation:");
                System.out.print("Enter the withdrawing amount : ");
                int with = sc.nextInt();
                if(balance>=with) {
                    balance = balance - with;
                System.out.println("Please collect your money and collect the card");
                System.out.println();
                System.out.println("Balance : " + balance);
                System.out.println();
                System.out.println("Thanks for using ATM !\n\n");
            }
            else {
                System.out.println("Sorry! Insufficient Funds");
                System.out.println();
                System.out.println("Thanks for using ATM !\n\n");
            }
    }
    static void deposite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deposit Operation:"); 
            System.out.print("Enter the depositing amount : ");
            int dept = sc.nextInt();
            balance = balance + dept;
            System.out.println("Your Money has been successfully deposited");
            System.out.println();
            System.out.println("Balance : " + balance);
            System.out.println();
            System.out.println("Thanks for using ATM !\n\n");
    }
    static void current() {
        System.out.println("Current Balance : " + balance);
            System.out.println();
            System.out.println("Thanks for using ATM !\n\n");
    }
    public static void main(String[] args) {
        while(true) {
        switch(menu()) {
            case 1:
            withdraw();
            break;
            case 2:
            deposite();
            break;
            case 3:
            current();
            break;
            case 4:
            return;
            default :
            System.out.println("You entered wrong key\n\n");
        }
        System.out.println("Enter the 0 for Exit and 1 for Main Menu : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1) menu();
        else return;
    }
    }
}