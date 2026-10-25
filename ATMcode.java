import java.util.*;
public class Atm {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to ATM");
        int balance=10000;
        int deposit=0;
        int withdrawal=0;
        do {
            System.out.println("Enter your pin");
            int pin= input.nextInt();
            if(pin==520){
                System.out.println("Select any option");
                System.out.println("Check your balance ---> press 1");
                System.out.println("Deposit money      ---> press 2");
                System.out.println("withdrowal money   ---> press 3");
                System.out.print("Enter the valid option : ");
                int opt= input.nextInt();
                if(opt==1){
                    System.out.println("Balance remaining is = "+balance);
                } else if (opt == 2){
                    System.out.print("Enter deposit money : ");
                    int dep=input.nextInt();
                    balance=balance+dep;
                    System.out.println("Total balance is "+(balance));
                }else if(opt==3){
                    System.out.print("Enter withdrawal Amount : ");
                    int with=input.nextInt();
                    balance=balance-with;
                    System.out.println("Remaining balance is "+balance);
                }else{
                    System.out.println("Invalid option");
                }
                return;
            }
            else{
                System.out.println("Incorrect PIN !!!!!");
                System.out.println(" try again ");
            }
            i++;
        }while (i<=3);
        if (i>3) {
            System.out.println("TRY LIMIT EXIT !!!");
            System.out.println("YOUR DEBIT CARD BLOCKED FOR 24 HOURS ");
        }
    }
}

