package archivos;

import util.RutaUtil;

import java.io.File;

public class textoPlano {

    public void crearHoja(String texto, String carpeta) {
        File comprobarCarpeta = new File(RutaUtil.getRutaBibliotecaFile() + File.separator + carpeta);
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
