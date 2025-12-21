// This is a simple unweighted GPA calculator
// Be sure to give credit if you use this code

import java.util.Scanner;

public class UnweightedGPA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        
        boolean calcGPA;
        System.out.print("Use this program(y/n): ");
        String yesNo = input.nextLine();
        String yes = "y";
        if (yesNo.indexOf(yes) != -1) {
            calcGPA = true;
        } else {
            calcGPA = false;
        }
        
        while (calcGPA) {
            // Tracks number of points towards your GPA
            double points = 0.0;
            System.out.printf("How many classes do you have? ");
            int numClasses = input.nextInt();
            input.nextLine();
            // The LOOP
            for (int i = 1; i <= numClasses; i++) {
                System.out.print("Grade of class #" + i + ": ");
                int classGrade = input.nextInt();
                input.nextLine();
                if (classGrade <0 || classGrade > 100) {
                    System.out.println("Invalid Class Grade. Please try again.");
                    i--;
                    continue;
                }
                
                if (classGrade >= 90) {
                    points += 4.0;
                } else if (classGrade >= 80) {
                    points += 3.0;
                } else if (classGrade >= 70) {
                    points += 2.0;
                } else if (classGrade >= 60) {
                    points += 1.0;
                } else {
                    points += 0.0;
                }
            }
            // Calculates unweighted GPA
            double GPA = (double) points/numClasses;
            //Prints GPA
            System.out.printf("Your unweighted GPA is %.3f%n", GPA);
            // This is a simple unweighted GPA calculator
// Be sure to give credit if you use this code

import java.util.Scanner;

public class UnweightedGPA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        
        boolean calcGPA;
        System.out.print("Use this program(y/n): ");
        String yesNo = input.nextLine();
        String yes = "y";
        if (yesNo.indexOf(yes) != -1) {
            calcGPA = true;
        } else {
            calcGPA = false;
        }
        
        while (calcGPA) {
            // Tracks number of points towards your GPA
            double points = 0.0;
            System.out.printf("How many classes do you have? ");
            int numClasses = input.nextInt();
            input.nextLine();
            // The LOOP
            for (int i = 1; i <= numClasses; i++) {
                System.out.print("Grade of class #" + i + ": ");
                int classGrade = input.nextInt();
                input.nextLine();
                if (classGrade <0 || classGrade > 100) {
                    System.out.println("Invalid Class Grade. Please try again.");
                    i--;
                    continue;
                }
                
                if (classGrade >= 90) {
                    points += 4.0;
                } else if (classGrade >= 80) {
                    points += 3.0;
                } else if (classGrade >= 70) {
                    points += 2.0;
                } else if (classGrade >= 60) {
                    points += 1.0;
                } else {
                    points += 0.0;
                }
            }
            // Calculates unweighted GPA
            double GPA = (double) points/numClasses;
            //Prints GPA
            System.out.printf("Your unweighted GPA is %.3f%n", GPA);
            System.out.println();
            System.out.printf("Use this program(y/n): ");
            yesNo = input.nextLine();
            if (yesNo.indexOf(yes) != -1) {
                calcGPA = true;
            } else {
                calcGPA = false;
                System.out.println("Thank you for using \"Unweight GPA Calculator Simple\"!");
                System.out.printf("\u00A9 2025 Garlin Phillips, All Rights Reserved. \"Unweighted GPA Cal Simple.\"");
            }
            
            
        }
        
    }
}
            System.out.println();
            
            System.out.printf("Use this program(y/n): ");
            yesNo = input.nextLine();
            if (yesNo.indexOf(yes) != -1) {
                calcGPA = true;
            } else {
                calcGPA = false;
                System.out.println("Thank you for using \"Unweight GPA Calculator Simple\"!");
                System.out.printf("\u00A9 2025 Garlin Phillips, All Rights Reserved. \"Unweighted GPA Cal Simple.\"");
            }
            
            
        }
        
    }
}