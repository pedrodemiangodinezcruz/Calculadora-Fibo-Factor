package calculadorafibo;
//Se importan todas las paqueterias de java a utilizar
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;
import javax.swing.*;
import javax.swing.JRadioButton;

public class Calculadora extends JFrame  
implements ActionListener {
    
    JButton b1;
    JLabel l1;
    JTextField t1, t2;
    //Radio botones iniciados sin selccionar
    JRadioButton rbtn1=new JRadioButton("Fibonacci",false);
    JRadioButton rbtn2=new JRadioButton("Factorial",false);

    public Calculadora(String t) {
        //Panel del campo de texto para numero
        super(t);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Numero:"));
        p1.add(t1 = new JTextField(20));
        
        //Inicializacion del boton "Aceptar"
        JPanel p3 = new JPanel();
        p3.add(rbtn1);
        p3.add(rbtn2);
        p3.setLayout(new FlowLayout());
        p3.add(b1 = new JButton("Aceptar"));
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.NORTH, p1);
        c.add(BorderLayout.CENTER, p3);
        b1.addActionListener(this);
    }
      
    public void actionPerformed (ActionEvent e) {
        
         //Valida que el dato sea numerico
        try{
         int Numero = Integer.parseInt(t1.getText());
        
        if(rbtn1.isSelected()==true&&rbtn2.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Error, no puedes hacer eso");
        }
        else if(rbtn1.isSelected()==true){
            //Operatividad fibonacci
            int a=0,b=1,c;
            for(int i=1;i<=Numero;i++){
                c=a+b;
                b=a;
                a=c;
            }

                JOptionPane.showMessageDialog(null, "Fibonacci: "+a);
            
        }else if(rbtn2.isSelected()==true){
            //Operatividad Factorial
            int Factorial= 1;
            for(int i=1; i<= Numero;i++){
                Factorial=Factorial*i;
            }

            JOptionPane.showMessageDialog(null, "Factorial: " + Factorial);

        }else{
            JOptionPane.showMessageDialog(null, "Error, no puedes hacer eso");
        }

    }catch(Exception a){
        //Exepciones
        JOptionPane.showMessageDialog(null, "Error, no puedes hacer eso");
        }
    }

}
