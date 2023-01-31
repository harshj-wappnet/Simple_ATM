class Account {
    int acountno;
    int amount;
    String name ;
    String phoneno;

    //parameterized constructor
    public Account(int acountno, String name,String  phoneno){
        this.acountno = acountno;
        this.name =name;
        this.phoneno = phoneno;
    }

    //deposite function for add money to user account
    void deposite(int iamount){

        amount = amount + iamount;
        System.out.println(iamount+" deposited sucessfully");
        System.out.println();
    }

    //debit function for user to debit money
    void debit(int damount){

        if (damount<=amount){
            amount = amount - damount;
            System.out.println(damount+" debited sucessfully collect cash");
        }
        else {
            System.out.println("insufficient balance");
        }


    }

    //check balance function
    void checkbalance(){
        System.out.println("Your balance is :"+amount);
        System.out.println();
    }


    //print user data
    void printdetails(){
        System.out.println("Your name is :"+name);
        System.out.println("your account number is :"+acountno);
        System.out.println("Your phone number is :"+phoneno);
        System.out.println();
    }

    //update function for update user details
    void updatedetails(String n, String pn){
        name =n;
        phoneno = pn;
    }
}
