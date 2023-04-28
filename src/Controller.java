import javax.swing.*;

public class Controller {

    Logic Log = new Logic();

    public String setMenu(String opt){
        int aux;
        String archivo = null;
        aux = Integer.parseInt(opt);
        if ( aux == 1) {
            archivo = Log.visor(aux);
        }
        else if(aux ==2 ){
            archivo = Log.creador(aux);
        }
        return  archivo ;

    }
}
