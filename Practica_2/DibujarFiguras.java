package Tareas_121;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax. swing.JPanel;
 public class DibujarFiguras extends JPanel{
    @Override
    public void paint (Graphics g){
        super.paint(g);
      //posiciones  x1   y1   x2   y2
        g.drawLine(100, 100, 200, 200);
        
        
        /*g.drawRect(300, 100, 100, 100);*/
        
        g.drawOval(/* este es el punto donde se mostrara*/  400, 
                /* es es el punto donde se encuentra deacuerdo a su poicion de del jframe*/ 100,
                /*la anchura*/ 100,
                /*la altura*/ 100);
    }
    
    public static void main(String [] args){
       JFrame ventana = new JFrame("Formas Básicas");
       DibujarFiguras objeto = new DibujarFiguras();
       ventana. add(objeto);
       ventana. setSize(700, 700);
       ventana. setLocationRelativeTo(null);
       ventana. setVisible(true);
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);