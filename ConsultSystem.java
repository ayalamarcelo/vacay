import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultSystem {
    public static final int CODE_COMMERCE = 1;
    public static final int CODE_GASTRONOMY = 2;
    public static final int CODE_BANKING = 3;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        boolean continueFlag = true;

        while (continueFlag) {
            try {
                String name = "";
                int code = 0, yearsOfService = 0;

                System.out.println("*******************************************************");
                System.out.println("******Welcome to the vacation system for employees*****");
                System.out.println("*******************************************************");
                System.out.println("");
                System.out.println("");

                System.out.println("*******************************************************");
                System.out.println("******Codes: Commerce 1, Gastronomy 2, Banking 3*******");
                System.out.println("*******************************************************");
                System.out.println("");
                System.out.println("");

                System.out.print("What is the name of the employee?: ");
                name = input.nextLine();
                System.out.println("");

                System.out.print("How many years of service does the employee have?: ");
                yearsOfService = input.nextInt();
                System.out.println("");

                System.out.print("What is the category code?: ");
                code = input.nextInt();
                System.out.println("");

                if (yearsOfService < 1 || code < 1 || code > 3) {
                    System.out.println("Error: Invalid years of service or category code.");
                } else {
                    calculateVacationDays(name, yearsOfService, code);
                }

                System.out.print("Do you want to make another inquiry? (Yes/No): ");
                String response = input.next();
                if (response.equalsIgnoreCase("No")) {
                    continueFlag = false;
                    System.out.println("Thank you for using the consultation system. Have a great day!");
                }
                input.nextLine(); // Clear the input buffer
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter a valid value.");
                input.nextLine(); // Clear the input buffer
            }
        }

        input.close();
    }

    private static void calculateVacationDays(String name, int yearsOfService, int code) {
        int calculatedVacationDays = 0;

        if (code == CODE_COMMERCE) {
            if (yearsOfService == 1) {
                calculatedVacationDays = 6;
            } else if (yearsOfService >= 2 && yearsOfService <= 6) {
                calculatedVacationDays = 14;
            } else if (yearsOfService >= 7) {
                calculatedVacationDays = 20;
            }
        } else if (code == CODE_GASTRONOMY) {
            if (yearsOfService == 1) {
                calculatedVacationDays = 7;
            } else if (yearsOfService >= 2 && yearsOfService <= 6) {
                calculatedVacationDays = 15;
            } else if (yearsOfService >= 7) {
                calculatedVacationDays = 22;
            }
        } else if (code == CODE_BANKING) {
            if (yearsOfService == 1) {
                calculatedVacationDays = 10;
            } else if (yearsOfService >= 2 && yearsOfService <= 6) {
                calculatedVacationDays = 20;
            } else if (yearsOfService >= 7) {
                calculatedVacationDays = 30;
            }
        } else {
            System.out.println("Error, the code is incorrect!");
            return;
        }

        System.out.println("Summary of the inquiry:");
        System.out.println("Name: " + name);
        System.out.println("Years of service: " + yearsOfService);
        System.out.println("Vacation days: " + calculatedVacationDays);
    }
}