package com.javisoft.ejercicios52.ej58;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time myTime;

        int hour = intInput(scanner, "Hour: ", 0, 23);
        int minute = intInput(scanner, "Minute (-1 to skip): ", -1, 59);
        if (minute == -1) {
            myTime = new Time(hour);
        } else {
            int second = intInput(scanner, "Second (-1 to skip): ", -1, 59);
            if (second == -1) {
                myTime = new Time(hour, minute);
            } else {
                myTime = new Time(hour, minute, second);
            }
        }

        System.out.println(myTime.toString());

    }

    private static int intInput(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    throw new InputMismatchException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Error: invalid input (not an integer).");
            } catch (InputMismatchException e) {
                System.out.println("Error: input out of range.");
            }
        }
    }
}
