import Notas.Folders;

import java.util.Scanner;

public class Main {
    private static String ruta = null;
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var folders = new Folders();
        System.out.println("1) crear carpeta de notas");
        System.out.println("2) elige donde guardar tus documentos");
        //System.out.println("3) crear archivo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 :
                System.out.println("dale un nombre a tu carpeta");
                folders.createFile(scanner.next());
                    break;
            case 2 :
                System.out.println("elige en que carpeta guardaras tu archivo");
                folders.listarCarpetasPrint();
                ruta = folders.listarCarpetas(scanner.nextInt());
                System.out.println("esta en la carpeta: " + ruta);
                break;
        }
    }

}
