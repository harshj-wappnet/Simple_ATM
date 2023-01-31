import java.util.Random;
import java.util.Scanner;

//Simple Demo project of Real Life ATM



public class Main {
    public static void main(String[] args) {

        //scanner class declare for user inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("-:WELCOME TO ATM:-");

        System.out.println("Enter Your name :");
        String name = sc.next();

        System.out.println("Enter Your phone number :");
        String phone_no = sc.next();

        //generates random number  for account number
        Random random = new Random();
        int accountno = random.nextInt(100,200);


        // object construction
        Account account = new Account(accountno,name,phone_no);//parameterized constructor call


        while (true){

            //Operation selection from user
            System.out.println("Select Operation you want to perform");
            System.out.println("1. Deposite Money");
            System.out.println("2. Debit money");
            System.out.println("3. View Balance");
            System.out.println("4. View Account Details ");
            System.out.println("5. Update Account Details");
            System.out.println("6. Exit");
            System.out.println("Enter Your choice:");


            //operation selection and respective function call according to user choice 
            int choice = sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("Enter Money You want to deposit");
                    int i_money = sc.nextInt();
                    account.deposite(i_money);
                    break;
                case 2:
                    System.out.println("Enter Money You want to debit");
                    int d_money = sc.nextInt();
                    account.debit(d_money);
                    break;
                case 3:
                    account.checkbalance();
                    break;
                case 4:
                    account.printdetails();
                    break;
                case 5:
                    System.out.println("Enter new name :");
                    String uname = sc.next();
                    System.out.println("Enter new Phone no: ");
                    String unumber = sc.next();
                    account.updatedetails(uname,unumber);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
