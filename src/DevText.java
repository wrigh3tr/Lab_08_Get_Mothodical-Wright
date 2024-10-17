import java.util.Scanner;
public class DevText {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name = getNonZeroLenString(in, "Enter Your Name: ");
        System.out.println("Name is " + name);
    }

    /**
     * Gets a String value from the user which must be at least on character
     * @param pipe scanner to use to read the input
     * @param prompt to tell the user what to input
     * @return String that is at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retVal = "";

        do {
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.isEmpty())
            {
                System.out.println("Input Not valid, please enter another string: ");
            }

        }while(retVal.isEmpty());
        return retVal;
    }

}