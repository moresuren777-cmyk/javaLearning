package Day1;

import java.util.Scanner;

public class AtmJourney {

    public static void main(String[] args) {

       int balance =0;
      welcomemessage();
      boolean issomeoneavaibaleonATM = true;
      while(issomeoneavaibaleonATM){
         Menuoptions();
         int option = getselectedoption();
         switch(option) {

             case 1:
                 System.out.println("Your Current available balance is =  "  + balance   +  "  /-  Rs.");
                 break;

            case 2:
                 int depositamount= DepositMoney();
                balance=balance+depositamount;
                System.out.println("your amount deposited succesfully.Your Current available balance is =  "  + balance   +  "  /-  Rs.");
                 break;
            case 3:
                int withdrawamt = withdrawMoney();
                if (withdrawamt <= balance) {
                    balance= balance-withdrawamt;
                    System.out.println("your amount withdrawn succesfully.Your Current available balance is =  "  + balance   +  "  /-  Rs.");
                }else {
                    System.err.println("Insufficient Funds!!!");
                }
                 break;
            case 4:
                System.out.println("please take paper provided by machine ");
                 break;
           case 5:
               issomeoneavaibaleonATM = false;
                 break;
             default:
                 System.err.println("You Have entered invalid option. please provide between 1 to 5");
      }
      thankyoumessage();
      }
    }

    static int DepositMoney(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Amount to deposit =");
        int Amt = scan.nextInt();
        System.out.println("you are depositing = " + Amt +"Rs.");
        return Amt;
    }
    static int withdrawMoney(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw =");
        int Amtwithdrw = scan.nextInt();
        System.out.println("you are Withdrawing = " + Amtwithdrw +"Rs.");
        return Amtwithdrw;
    }
    static void welcomemessage(){

        System.out.println("=================================");
        System.out.println("Welcome to SBI ATM..Simple way Of Banking");
        System.out.println("=================================");
    }
    static void thankyoumessage(){

        System.out.println("=================================");
        System.out.println("Thanks to visting SBI ATM..Simple way Of Banking");
        System.out.println("=================================");
    }
    static void Menuoptions(){
        System.out.println("=================================");
        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 to Deposit Money");
        System.out.println("Press 3 to WithDraw Money");
        System.out.println("Press 4 to check mini statement");
        System.out.println("Press 5 to EXIT");
        System.out.println("=================================");

    }
    static int getselectedoption(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your option =");
        int option = scan.nextInt();
        System.out.println("you have entered = " + option);
        return option;
    }
}
