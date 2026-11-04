package util;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner scanner = new Scanner(System.in);

    public static String captarTexto(String mensaje) {
        System.out.println(mensaje + ": ");
        return scanner.nextLine();
    }

    public static int captarEntero (String mensaje) {
        System.out.println(mensaje + ": ");
        int dato = scanner.nextInt();
        scanner.nextLine();
        return dato;
    }

    public static double captarDecimal (String mensaje) {
        System.out.println(mensaje + ": ");
        double dato = scanner.nextDouble();
        scanner.nextLine();
        return dato;
    }
}