
package calculadorafibo;

import javax.swing.JFrame;

public class CalculadoraFibo {


    public static void main (String[] args) {
        //Se inicializa la ventana principal
        JFrame frame = new Calculadora("Caculadora Fibo-Fac");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
