
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author YORSH
 */
public class mainSentenciaIfElse {

    static String numero;
    static boolean adivina = true;
    static int x;
    static int y = 20;

    public static void main(String[] args) {

        //Write an if statement that assigns 0 to x when y is equal to 20.
        while (adivina) {
            numero = JOptionPane.showInputDialog("dame un numero de 15 a 25");

            x = Integer.parseInt(numero);
            if (x == y) {
                JOptionPane.showMessageDialog(null, "correcto, ahora X es igual 0");
                x = 0;
                adivina = false;
            } else if (x <= 14 || x >= 25) {
                 JOptionPane.showMessageDialog(null," tan menso, dije numero entre 15 y 20, no " + x + "!!!!");

            } else {
                JOptionPane.showMessageDialog(null, "incorrecto dame otro numero que no sea " + x);
            }
        }
    }

}
