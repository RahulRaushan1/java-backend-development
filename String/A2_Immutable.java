package String;

public class A2_Immutable {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = s1.concat("full Stack");
        System.out.println(s1==s2);
    }
}
