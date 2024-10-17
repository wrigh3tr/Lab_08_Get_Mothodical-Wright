import java.util.Scanner;
public class DevText {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
    String name = getNonZeroLenString(in, "Enter Your Name: ");
        System.out.println("Name is " + name);
    }


int age = getInt(in,"Enter Your Age: ");
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

    /**
     * Gets an Unconstrained integer value from the user
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained integer value
     */




    public static int getInt(Scanner pipe, String prompt){
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not" + trash);
            }


        }while(!done);
        return retVal;
    }

    /**
     * Gets an Unconstrained double value from the user
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained double value
     */





    public static double getDouble(Scanner pipe, String prompt){
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an double not" + trash);
            }


        }while(!done);
        return retVal;
    }





    /**
     * Gets an integer input within a range from the user
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an restrained integer value
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {done = true;}
                else{
                    System.out.println("You Must enter a valid integer in range of [" + low + " to " + high + "]");
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }


        }while(!done);
        return retVal;
    }

    /**
     * Gets a double input within a range from the user
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an restrained double value
     */



    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You Must enter a valid double in range of [" + low + " to " + high + "]");
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double  not " + trash);
            }


        }while(!done);
        return retVal;
    }

/**
 * Gets a String value from the user which must be y or n
 * @param pipe scanner to use to read the input
 * @param prompt to tell the user what to input
 * @return true for y false for no using a boolean statement
 */




public static boolean getYNConfirm(Scanner pipe, String prompt)
{
   boolean retVal = false;
   String input = "";
   boolean done = false;

    do {
        System.out.println(prompt + "[y or n]: ");
        input = pipe.nextLine();
        if (input.isEmpty())
        {
            System.out.println("Input Not valid, please enter another string[y or n]: ");
        }
        else if(input.equalsIgnoreCase("y"))
        {
            retVal = true;
        }
        else if(input.equalsIgnoreCase("n"))
        {
            retVal = false;
        }
        else
        {
            System.out.println("You Must enter a valid string[y or n]: ");
        }
    }while(!done);
    return retVal;
}

}