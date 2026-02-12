package String;

public class A3_ReverseString {
    public static void main(String[] args) {
        String s1 = "Abhishek";

        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        // Reverse Loop   ----> kehsihbA
        for(int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        String revString ="";
        for(int i=s1.length()-1;i>=0;i--){
           revString += s1.charAt(i);
        }
        System.out.println(revString);
    }
}
