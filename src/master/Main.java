package master;

import develop.ConvertService;

import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static double num1;
    static String output;

    public static void main(String[] args) {
        System.out.println("CONVERTER");
        System.out.println("Version 1.0");
        getMenu();
        runAction(getOption());
    }

    private static void getMenu() {
        System.out.println("""
                Choose an option:
                1 - get convert mph/kmh.
                2 - get convert kmh/mph.
                0 - close the app.
                """);
    }

    private static int getOption() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runAction(int opt) {
        switch (opt) {
            case 1 -> {
                ConvertMphToKmh service = new ConvertMphToKmh();
                System.out.print("Enter mph ");
                num1 = scanner.nextDouble();
                output = service.convMphToKmh(num1);
                System.out.println("You result " + output + " kmh");
            }
            case 2 -> {
                ConvertService service = new ConvertService();
                System.out.print("Enter kmh ");
                num1 = scanner.nextDouble();
                output = service.convKmhToMph(num1);
                System.out.println("You result " + output + " mph");
            }
            case 0 -> {
                System.out.println("App's closed.");
                scanner.close();
                System.exit(0);
            }
        }
    }
}