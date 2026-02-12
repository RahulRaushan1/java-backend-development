package Exception_Handling.CustomException;

public class A2_ATM {
    public static void main(String[] args) {
        try {
            withdraw(1000,1500);
        }
        catch (A1_InsufficientBalException e){
            System.out.println("Exception Bal ins");
        }
    }
    public static void withdraw(double bal,double amt) throws A1_InsufficientBalException{
        if(amt>bal){
            throw new A1_InsufficientBalException("Insufficient Balance : Availaible bal" + bal+ "requested" +amt );
        }
        System.out.println("withdrawal of amount"+amt+"sucessful");
    }
}
