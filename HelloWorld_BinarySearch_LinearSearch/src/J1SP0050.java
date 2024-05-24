package j1sp0050;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import Controller.GetInput;

public class J1SP0050 {

    public static void main(String[] args) {
        while (true) {
            // Display a menu and ask users to select an option.
            int choice = DisplayOption();
            // Perform the calculation based on the choice.
            Calculate(choice);
        }
    }

    public static int DisplayOption() {
        GetInput sc = new GetInput();

        System.out.println("==Equation Program==");
        System.out.println("1. Calculate superlative Equation");
        System.out.println("2. Calculate quadratic equation");
        System.out.println("3. Exit");
        System.out.print("Please choose one option: ");
        return sc.inputInt("Please choose one option: ", 1, 3);
    }

    public static void Calculate(int choice) {
        switch (choice) {
            case 1:
                SuperlativeEquationCalculator();
                break;
            case 2:
                QuadraticEquationCalculator();
                break;
            case 3:
                System.exit(0);
        }
    }

    private static void SuperlativeEquationCalculator() {
        GetInput vld = new GetInput();
        float a = vld.inputFloat("Enter A = ");
        float b = vld.inputFloat("Enter B = ");
        float x = -b / a;
        System.out.format("Solution x = %.3f", x);
        System.out.println("");

        List<Float> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);
        lists.add(x);

        System.out.println("Number of even: ");
        Display(lists, "even");
        System.out.println("Number of odd: ");
        Display(lists, "odd");
        System.out.println("Number of perfect square: ");
        Display(lists, "square");
    }

    private static void QuadraticEquationCalculator() {
        // Implementation for quadratic equation
    }

    public static void Display(List<Float> list, String msg) {
        DecimalFormat dc = new DecimalFormat("#0.0#");
        GetInput input = new GetInput();
        StringBuilder result = new StringBuilder();

        switch (msg) {
            case "odd": {
                for (float f : list) {
                    if (input.checkOdd(f)) {
                        if (result.length() > 0) {
                            result.append(", ");
                        }
                        result.append(dc.format(f));
                    }
                }
                break;
            }
            case "even": {
                for (float f : list) {
                    if (!input.checkOdd(f)) {
                        if (result.length() > 0) {
                            result.append(", ");
                        }
                        result.append(dc.format(f));
                    }
                }
                break;
            }
            case "square": {
                for (float f : list) {
                    if (input.checkPerfectSquare(f)) {
                        if (result.length() > 0) {
                            result.append(", ");
                        }
                        result.append(dc.format(f));
                    }
                }
                break;
            }
        }
        
        if (result.length() == 0) {
            result.append("There is no solution!");
        }
        System.out.println(result);
    }
}
