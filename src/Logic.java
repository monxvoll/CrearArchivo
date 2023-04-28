import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.*;

public class Logic {

    FileReader archivo;
    BufferedReader lector;
    private String opt;



    public String visor(int opt) {


        String show = null;
        try {

            archivo = new FileReader("C:\\Programacion\\hola.txt");

            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String abc;
                while ((abc = lector.readLine()) != null) {
                    show = abc;
                }
            } else {
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return show;
    }


    public String  creador (int opt) {
        FileWriter archivo = null;
        PrintWriter texto = null;

        try {
            archivo = new FileWriter("C:\\Programacion\\escrito.txt");
            texto = new PrintWriter(archivo);
            texto.println("¡¡Archivo txt creado con exito!!");
        }catch (Exception e) {
             e.getMessage();
        }
        return String.valueOf(texto);
    }

}
