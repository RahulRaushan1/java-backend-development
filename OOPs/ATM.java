package OOPs;

public class ATM {
   private String BankHoldername;
   private int balance;

    ATM( String name,int bal){
        this.BankHoldername= name;
        this.balance = bal;
    }
    public static void main(String[] args) {
        ATM atm = new ATM ("Ram",10000);
        atm.showBal();

    }
    void showBal(){
        System.out.println("BankHolderName :"+ BankHoldername + " Balance :" + balance);
    }
}
