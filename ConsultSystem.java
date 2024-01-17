import java.util.Scanner;

public class ConsultSystem {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int code = 0, yearsOfService = 0;

        System.out.println("*******************************************************");
        System.out.println("*Welcome to the vacation system for employees*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");

        System.out.println("*******************************************************");
        System.out.println("*Codes: Commerce 1, Gastronomy 2, Banking 3*");
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

        if (code == 1) {

            if (yearsOfService == 1) {
                System.out.println("Employee " + name + " is entitled to 6 days of vacation");
            } else if (yearsOfService >= 2 && yearsOfService <= 6) {
                System.out.println("Employee " + name + " is entitled to 14 days of vacation");
            } else if (yearsOfService >= 7) {
                System.out.println("Employee " + name + " is entitled to 20 days of vacation");
            }
        } else if (code == 2) {
            if (yearsOfService == 1) {
                System.out.println("Employee " + name + " is entitled to 7 days of vacation");
            } else if (yearsOfService >= 2 && yearsOfService <= 6) {
                System.out.println("Employee " + name + " is entitled to 15 days of vacation");
            } else if (yearsOfService >= 7) {
                System.out.println("Employee " + name + " is entitled to 22 days of vacation");
            }

        } else if (code == 3) {
            if (yearsOfService == 1) {
                System.out.println("Employee " + name + " is entitled to 10 days of vacation");
            } else if (yearsOfService >= 2 && yearsOfService <= 6) {
                System.out.println("Employee " + name + " is entitled to 20 days of vacation");
            } else if (yearsOfService >= 7) {
                System.out.println("Employee " + name + " is entitled to 30 days of vacation");
            }

        } else {
            System.out.println("Error, the code is incorrect!");
        }

        input.close();
    }
}