package ToolsPackage;

import java.util.Scanner;

public class Tools {
    public static void print(String string){
        System.out.println(string);
    }

    public static Scanner inputScan(){
        return new Scanner(System.in);
    }

    public static String inputString(){
        return inputScan().nextLine();
    }

    public static int inputInt(){
        Scanner scanner = inputScan();
        return scanner.hasNextInt() ? scanner.nextInt() : 0;
    }

    public static double inputDouble(){
        Scanner scanner = inputScan();
        return scanner.hasNextDouble() ? scanner.nextDouble() : 0.0;
    }

    public static boolean inputBool(String isTrue){
        return inputString().equalsIgnoreCase(isTrue);
    }

    public static String getTime(int minutes){
        int days = 0, hours = 0;

        while (minutes > 60){
            minutes = minutes - 60;
            hours++;
        }

        while (hours > 24){
            hours = hours - 24;
            days++;
        }
        return days + " days, " + hours + " hours, " + minutes + " minutes.";
    }
}
