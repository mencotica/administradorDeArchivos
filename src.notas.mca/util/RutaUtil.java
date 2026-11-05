package util;

import java.io.File;


public class RutaUtil {


    private static String rutaDondeEstoy = System.getProperty("user.dir"); // busca la ruta donde se encuentra el programa
    private static String rutaBibliotecaString = rutaArchivos().getAbsolutePath();
    private static File rutaBibliotecaFile = rutaArchivos();

    public static File rutaArchivos() {
        String rutaArchivos = rutaDondeEstoy + File.separator + "biblioteca";
        File ruta = new File(rutaArchivos);

        try {

            if (!ruta.exists()) {
                ruta.mkdir();
            }

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage());

        }

        return ruta;

    }

    public static String getRutaBibliotecaString() {
        return rutaBibliotecaString;
    }

    public static File getRutaBibliotecaFile () {
        return rutaBibliotecaFile;
    }
}
