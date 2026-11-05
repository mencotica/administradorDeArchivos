import folders.Folders;
import util.ScannerUtil;

public class Main {

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
        }
    }

}
