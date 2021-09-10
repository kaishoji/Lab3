// -----------------------------------------------------
// Author: Kai Ohsawa
// Filename: Lab3.java
// Specification: To accept user input of homework, midterm, and final grades, and return
// the weighted total, as well as whether the user passed or failed their class.
// For: CSE 110 - Lab #3
// Time Spent: 1 and 1/2 hours.
// -----------------------------------------------------

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int i = 0;

        double gradeHW = 0;
        double gradeMidterm = 0;
        double gradeFinal = 0;

            // this sets the condition for the while loop (while i < 3, ...)
             while (i < 3) {
                
                // collects homework value
                if (i == 0) {
                    System.out.print("Please enter your HOMEWORK grade: ");
                    gradeHW = scan.nextDouble();
    
                    // this is an input validation check, either a value < 0 or > 100 will prompt the user
                    // for another, valid input...
                    if (gradeHW < 0 || gradeHW > 100) {
                        System.out.println("[ERR] Invalid input. Enter a value between [0 and 100].");
                    } else {
                        i++;
                    }
                }

                // collects midterm value
                if (i == 1) {
                    System.out.print("Please enter your MIDTERM grade: ");
                    gradeMidterm = scan.nextDouble();

                    // this is another input validation check
                    if (gradeMidterm < 0 || gradeMidterm > 100) {
                        System.out.println("[ERR] Invalid input. Enter a value between [0 and 100].");
                    } else {
                        i++;
                    }
                }

                // collects the final exam value
                if (i == 2) {
                    System.out.print("Please enter your FINAL exam grade: ");
                    gradeFinal = scan.nextDouble();

                    // this is another input validation check
                    if (gradeFinal < 0 || gradeFinal > 200) {
                        System.out.println("[ERR] Invalid input. Enter a value between [0 and 200].");
                    } else {
                        i++;
                    }
                }
            } 
        double totalWeighted; 

        // calculates the total weighted final grade, and stores it in the variable
        totalWeighted = (gradeFinal / 200 * 50) + (gradeMidterm * 0.25) + (gradeHW * 0.25);

            // checks if the final weighted grade allows a student to pass...
            if (totalWeighted >= 50) {
                System.out.println("[INFO] Student's Weighted Total is " + totalWeighted);
                System.out.println("[INFO] Student PASSED the class.");
                // checks if the final weighted grade allows a student to pass...
            }  else {
                System.out.println("[INFO] Student's Weighted Total is " + totalWeighted);
                System.out.println("[INFO] Student FAILED the class.");
            }
    }
}
