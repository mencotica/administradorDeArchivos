import Notas.Folders;
import util.ScannerUtil;

import java.util.Scanner;

public class Main {
    private static String ruta = null;
    public static void main(String[] args) {

        var folders = new Folders();
        System.out.println("1) crear carpeta de notas");
        System.out.println("2) elige donde guardar tus documentos");
        //System.out.println("3) crear archivo");
        int opcion = ScannerUtil.captarEntero("selecciona una opción");

        switch (opcion) {
            case 1 :
                folders.createFile(ScannerUtil.captarTexto("dale un nombre a tu carpeta "));
                    break;
            case 2 :
                folders.listarCarpetasPrint();
                ruta = folders.listarCarpetas(ScannerUtil.captarEntero("elige en que carpeta guardaras tu archivo"));
                System.out.println("esta en la carpeta: " + ruta);
                break;
        }
    }

}
