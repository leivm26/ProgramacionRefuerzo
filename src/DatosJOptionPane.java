import javax.swing.*;

public class DatosJOptionPane {
    public static void main (String [] args){
        String cadena;
        char letra;
        double decimal;
        int entero;


        cadena= JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra= JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal= Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showMessageDialog(null,"la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
    }
}
