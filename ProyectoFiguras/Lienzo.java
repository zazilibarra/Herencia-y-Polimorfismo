import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;
public class Lienzo extends JPanel
{
   public Lienzo()
   {
       ArrayList<Figura> figuras = new ArrayList<Figura>();
       
       Color negro = new Color (100,55,200);
       
       Triangulo t1 = new Triangulo(50, 300, 100, 80, negro);
       Circulo c1 = new Circulo(200, 200, 100, negro);
       Cuadrado s1 = new Cuadrado(350, 200, 100, negro);
       Rombo r1 = new Rombo(500, 250, 100, 100, negro);
       
       figuras.add(t1);
       figuras.add(c1);
       figuras.add(s1);
       figuras.add(r1);
    }
    
   @Override
   public void paintComponent(Graphics g)
   {
       Iterator<Figura> it = figuras.iterator();
       
       while(it.hasNext())
       {
           Figura figura = it.next();
           figura.dibuja(g);
       }
   }
}