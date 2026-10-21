package Notas;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Folders {

    public void createFile (String nameFile) {
        // se debe cambiar ruta para que siempre escoja la misma carpeta sin importar el sistema operativo
        Path ruta = Paths.get("Biblioteca", nameFile).toAbsolutePath();
        try {
            File carpeta = ruta.toFile();
            if (!carpeta.exists()) {
                carpeta.mkdir();
            } else {
                System.out.println("la carpeta ya existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void listarCarpetasPrint () {
        File directory = new File ("D:/platzi/codigo_practica/notas/Biblioteca/");

        File [] folders = directory.listFiles(File::isDirectory);
        int index = 0;
        for (File f: folders){
            System.out.println(index + ") " + f.getName());
            index++;
        }
    }

    public String listarCarpetas (int folder) {
        String nameFolder = null;
        File directory = new File ("D:/platzi/codigo_practica/notas/Biblioteca/");

        File [] folders = directory.listFiles(File::isDirectory);
        boolean condicion = false;
        try {
            var sc = new Scanner(System.in);
            while (!condicion) {
                if (folder >= folders.length || folder < 0) {
                    System.out.println("opcion no valida, vuelve a intentar");
                    folder = sc.nextInt();
                    continue;
                }
                nameFolder = folders[folder].getName();
                condicion = true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        String routerFile = "D:/platzi/codigo_practica/notas/Biblioteca/" + nameFolder;
        return routerFile;
    }

}
