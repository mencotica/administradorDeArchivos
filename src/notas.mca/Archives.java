package Notas;

import java.io.File;

public class Archives {

    public void crearHoja(String texto, String carpeta) {
        File comprobarCarpeta = new File("D:/platzi/codigo_practica/notas/administradorDeArchivos/Biblioteca/" + carpeta);
        if (comprobarCarpeta.exists() && comprobarCarpeta.isDirectory()) {
            try {
                File hoja = new File(carpeta, texto + ".txt");
                System.out.println("hoja creada con éxito");
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage() + "Error al crear hoja de notas");
            }
        }
    }
}
