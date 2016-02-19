package ui;

/**
 * Created by Alvaro on 2/17/2016.
 * Console class from chapter 8 murach
 */

import java.util.Scanner;

public class Console {

    private static Scanner sc = new  Scanner(System.in);

    public static void displayLIne() {
        System.out.println();
    }

    public static void displayLIne(String s){
        System.out.println(s);
    }

    public static String getString(String prompt){
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static int getInt(String prompt){
        //check for an int
        int i = 0;
        while (true){
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
        return i;
    }

    public static double getDouble(String prompt){
        //check for a double
        double d = 0;
        while (true){
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Error! Invalid decimal. Try again.");
            }
        }
        return d;
    }
}
