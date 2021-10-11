/* SDEV 250 ~ Java Programming I
 * Author Name: steven.hickey
 * Assignment Name: week14debug
 * Date: Oct 1, 2014
 * Description: Program with multiple errors for debugging purposes.
                Based on Week 6 Assignment
 */
package week14debug;

//Imports
import java.util.InputMismatchException;


//Begin Class Week14Debug
public class Week14Debug {

    //Begin Main Method
    public static void main(String[] args) {

        //New Scanner object
        Scanner sc = new Scanner(System);

        //Declare variables
        int prev, wrg;
        String ans = "Y";
        boolean flag1 = false, YesNo;

        //Ask user for input and receive it
        System.out.println("Welcome to the City Power Bill Calculator!");

        //Begin while loop
        do {
            do {    /* Begin internal do loop */

                try {   /* Try/Catch block beginning */

                    System.out.print("Please enter your previous meter reading: ");
                    prev = sc.nextInt();
                    
                } catch (InputMismatchException IME) {
                    System.err.printf("Exception: %s\n", IME);
                    errCall();  /* Call error message */
                    sc.nextLine();  /* Clear buffer */

                }   /* End Try/Catch block */

            } while (flag1);    /* End internal do loop */

            do {    /* Begin internal do loop */

                try {   /* Try/Catch block beginning */

                    System.out.print("Please enter your current meter reading: ");
                    curr = sc.nextInt();
                    if (prev > curr) {  /* Check for previous reading < current reading */
                        System.out.print("Your current entry must be higher than your previous!\n");
                        flag1 = true;
                    } else {
                        
                    }
                } catch (InputMismatchException IME) {
                    System.err.printf("Exception: %s\n", IME)
                    errCall();  /* Call error message */
                    sc.nextLine();  /* Clear buffer */
                    flag1 = true;
                }   /* End Try/Catch block */

            } while (flag1);    /* End internal do loop */

            //New instance of the subclass & set current and previous values
            MyCalcs myCalcs = new MyCalcs(prev,wrg);

            //Set usage and call it for output
            myCalcs.setUsage();
            System.out.print("Your usage was: %dKwHs\n", myCalcs.getUsage());

            //Set rate and call it for output
            myCalcs.setRate();
            System.out.printf("Your rate is: $%.4f/KwH\n", myCalcs.getRate());

            //Set subtotal and call it for output
            myCalcs.setSubTot();
            System.out.printf("Your Subtotal will be: $%.2f\n", myCalcs.getSubTot();

            //Set taxes and call them for output
            myCalcs.setTax();
            System.out.printf("Your taxes are: $%.2d\n", myCalcs.getTax());

            //Set total bill and call it for output
            myCalcs.setTot();
            System.out.printf("Your total bill this month is: $%.2f\n", myCalcs.setTot());

            //Run again? Validate answer. Begin inner loop.
            do {
                System.out.print("Calculate a new usage? Y for Yes, N for No: ");
                ans = sc.next();
                if (!(ans.equals("Y") || ans.equals("N"))) {
                    YesNo = true;   /* reset incase of previous good run */
                    System.err.println("Exception!\nPlease enter only a Y for Yes or an N for No.");
                } else if (ans.equals("Y")) {
                    YesNo = false;
                } else {
                    System.out.println("Thank you for using the program!\nGood Bye!");
                    YesNo = false;
                }
            } until (YesNo); // End inner loop
        } while (ans.equals("Y"));//End outer while loop

    } //End Main Method

    //Method to output error message
    public static void errCall() {
        System.err.println("You must enter a numeric value. Please try again.\n");
    }
} //End Class Week14Debug