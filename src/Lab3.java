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

        double grade_HW = 0;
        double grade_Midterm = 0;
        double grade_Final = 0;

             while (i < 3) 
             {
        
                if (i == 0)
                {
                    System.out.println("Please enter your homework grade:");
                    grade_HW = scan.nextDouble();

                    if (grade_HW < 0 || grade_HW > 100)
                    {
                        System.out.println("[ERR] Invalid input. Enter a value between [0 and 100].");
                    } else
                        {
                            i++;
                        }
                }
                if (i == 1)
                {
                    System.out.println("Please enter your midterm grade:");
                    grade_Midterm = scan.nextDouble();

                    if (grade_Midterm < 0 || grade_Midterm > 100)
                    {
                        System.out.println("[ERR] Invalid input. Enter a value between [0 and 100].");
                    } else
                        {
                            i++;
                        }
                if (i == 2)
                {
                    System.out.println("Please enter your final exam grade:");
                    grade_Final = scan.nextDouble();

                    if (grade_Final < 0 || grade_Final > 200)
                    {
                        System.out.println("[ERR] Invalid input. Enter a value between [0 and 200].");
                    } else 
                        {
                            i++;
                        }
                }
            } 
        }
        double total_weighted;

        total_weighted = (grade_Final / 200 * 50) + (grade_Midterm * 0.25) + (grade_HW * 0.25);

        if (total_weighted >= 50) 
        {
            System.out.println("[INFO] Student's Weighted Total is " + total_weighted);
            System.out.println("[INFO] Student PASSED the class.");
        }   else
            {
                System.out.println("[INFO] Student's Weighted Total is " + total_weighted);
                System.out.println("[INFO] Student FAILED the class.");
            }
    }
}
