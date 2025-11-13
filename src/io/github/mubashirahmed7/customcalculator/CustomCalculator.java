package io.github.mubashirahmed7.customcalculator;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

class MyCusCalcException extends Exception {
    public MyCusCalcException(String r) {
        super(r);
    }
    public String toString() {
        return super.toString();
    }
    public String getMessage() {
        return super.getMessage();
    }
}

class CustomCalc {
    private Scanner sc = new Scanner(System.in);
    private final LinkedList<String> history = new LinkedList<>(); // Store calculation results

    public double getNumber() {
        while (true) {
            try {
                System.out.print("Enter The Number Here: ");
                double a = sc.nextDouble();
                if (a > Double.MAX_VALUE || a < -Double.MAX_VALUE) {
                    throw new MyCusCalcException("Max Input Exception: Enter any number under (+ or -) "+Double.MAX_VALUE+".");
                }
                return a;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input Exception: Please enter a valid number.");
                sc.nextLine();
            } catch (MyCusCalcException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void addition() {
        System.out.println("Enter any two numbers for addition!");
        double a = getNumber();
        double b = getNumber();
        double result = a + b;
        String calculation = String.format("%.2f + %.2f = %.2f", a, b, result);
        System.out.println(calculation);
        history.add(calculation);
    }

    public void subtraction() {
        System.out.println("Enter any two numbers for subtraction!");
        double a = getNumber();
        double b = getNumber();
        double result = a - b;
        String calculation = String.format("%.2f - %.2f = %.2f", a, b, result);
        System.out.println(calculation);
        history.add(calculation);
    }

    public void multiplication() {
        while (true) {
            System.out.println("Enter any two numbers for multiplication!");
            double a = getNumber();
            double b = getNumber();
            try {
                if (a > 70000 || b > 70000) {
                    throw new MyCusCalcException("Max Multiplier Value Reached: Please enter any number under 70000");
                }
                double result = a * b;
                String calculation = String.format("%.2f * %.2f = %.2f", a, b, result);
                System.out.println(calculation);
                history.add(calculation);
                break;
            } catch (MyCusCalcException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void division() {
        while (true) {
            System.out.println("Enter any two numbers for division!");
            double a = getNumber();
            double b = getNumber();
            try {
                if (b == 0) {
                    throw new ArithmeticException("Cannot Divide By Zero");
                }
                double result = a / b;
                String calculation = String.format("%.2f / %.2f = %.2f", a, b, result);
                System.out.println(calculation);
                history.add(calculation);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No calculations in history.");
            return;
        }
        System.out.println("Calculation History:");
        for (String calc : history) {
            System.out.println(calc);
        }
    }
}

public class CustomCalculator {
    public static void main(String[] args) {
        CustomCalc obj = new CustomCalc();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Show History\n6. Exit");
            System.out.print("Choose an option (1-6): ");
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // Clear buffer
                switch (choice) {
                    case 1: obj.addition(); break;
                    case 2: obj.subtraction(); break;
                    case 3: obj.multiplication(); break;
                    case 4: obj.division(); break;
                    case 5: obj.showHistory(); break;
                    case 6: System.out.println("Exiting..."); sc.close(); return;
                    default: System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                sc.nextLine();
            }
        }
    }
}
