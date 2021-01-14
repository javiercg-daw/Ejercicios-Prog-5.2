package com.javisoft.ejercicios52.ej58;

import java.util.Scanner;

public class Ej58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time myTime;

        int hour = timeInput(scanner, "Hour: ", 23, false);
        int minute = timeInput(scanner, "Minute (empty to skip): ", 59, true);

        if (minute == -1) {
            myTime = new Time(hour);

        } else {
            int second = timeInput(scanner, "Second (empty to skip): ", 59, true);
            if (second == -1) {
                myTime = new Time(hour, minute);

            } else {
                myTime = new Time(hour, minute, second);
            }
        }

        System.out.println(myTime.toString());
    }

    public static int timeInput(Scanner scanner, String prompt, int max, boolean skippable) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (skippable && input.isEmpty()) {
                return -1;
            }

            try {
                int time = Integer.parseInt(input);
                if (time > max || time < 0) {
                    System.out.println("Error: input out of range [0-" + max + "].");
                    continue;
                }
                return time;

            } catch (NumberFormatException e) {
                System.out.println("Error: invalid time.");
            }
        }
    }

}
