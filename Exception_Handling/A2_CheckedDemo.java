package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A2_CheckedDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file= new FileReader("genie.txt");
    }
}
