package Day1;

import java.util.Scanner;

public class Atmjournyprac {

    public static void main(String[] args) {
        int balan =0;
        welcomemsg();
        boolean humamavailable = true;
        while (humamavailable){
            menu();
            int option= checkenteroption();
            switch (option){

                case 1:
                    System.out.println("your current Available Balance is =  " + balan  + " /-  Rs.");
                    break;
                case 2:
                    int depositedamt = depositfunds();
                    balan= balan+depositedamt;
                    System.out.println("You funds added successfully and your current balance is  =  " + balan + "  /-  Rs.");
                    break;
                case 3:
                    int withdrw =  withdrawfunds();
                    if (withdrw <= balan){
                       balan=balan-withdrw;
                        System.out.println("You funds withdrwan successfully and your current balance is  =  " + balan + "  /-  Rs.");
                    }
                    else {
                        System.err.println("Insufficient Funds !!!!");
                    }

                    break;
                case 4:
                    resetpin();
                    break;
                case 5:
                    System.out.println("Please take paper from machine");
                    break;
                case 6:
                    humamavailable = false;
                    break;
                default:
                    System.err.println("you have entered Wrong option!!! Please enter between 1 to 6");
            }
            thankumsg();
        }
        }

            static void welcomemsg () {

                System.out.println("====================================");
                System.out.println("Welcome to HDFC ATM....Banking is Easy now");
                System.out.println("====================================");

            }
            static void thankumsg () {

                 System.out.println("====================================");
                 System.out.println("Thank you for Visiting HDFC ATM....Banking is Easy now");
                 System.out.println("====================================");

    }
            static void menu () {

                System.out.println("====================================");
                System.out.println("Enter 1 to check balance");
                System.out.println("Enter 2 to deposit Funds");
                System.out.println("Enter 3 to Withdraw Funds");
                System.out.println("Enter 4 to RESET PIN");
                System.out.println("Enter 5 to Mini Statement");
                System.out.println("Enter 6 to EXIT");
                System.out.println("====================================");

            }
            static int checkenteroption () {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter your option");
                int option = scan.nextInt();
                System.out.println("You have entered  =  " +    option);
                return option;
            }
            static int depositfunds () {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter Amount to deposit = ");
                int dfund = scan.nextInt();
                System.out.println("You are Adding   =  " +    dfund);
                return dfund;
    }
            static int withdrawfunds () {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter Amount to withdrawn = ");
                int wfund = scan.nextInt();
                System.out.println("You are Withdrwaing   =  " +    wfund);
                return wfund;
    }
            static int resetpin () {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter new 4 digit PIN = ");
                int pin = scan.nextInt();
                System.out.println("Please re-confirm new 4 digit PIN = ");
                int pin2 = scan.nextInt();
                if (pin == pin2) {
                    System.out.println("Your new PIN is    =  " +    pin2);
                    System.out.println("New PIN Reset Sucessfully.....use it on your next login");

                }else {
                    System.out.println("please check...PIN is not matching");
                }
                return pin2;
    }

        }
