import javax.swing.*;


public class Main {
    public static void main(String[] args) {
     Controller Control = new Controller();
     String aux;
     aux = JOptionPane.showInputDialog("Bienvenido a SKRL\nPor favor digite:\n[1] para abrir un archivo\n[2] para crear un archivo");

       JOptionPane.showMessageDialog(null, ""+Control.setMenu(aux));


    }
}