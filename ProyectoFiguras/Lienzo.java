import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
public class Lienzo extends JPanel
{
   @Override
   public void paintComponent(Graphics g)
   {
       ArrayList<Figura> figuras = new ArrayList<Figura>();
       
       Triangulo t1 = new Triangulo(100, 50, 30, 50);
       Circulo c1 = new Circulo(100, 100, 30);
       Cuadrado s1 = new Cuadrado(100, 150, 30);
       
       figuras.add(t1);
       figuras.add(c1);
       figuras.add(s1);
       
       Iterator<Figura> it = figuras.iterator();
       
       while(it.hasNext())
       {
           Figura figura = it.next();
           figura.dibuja(g);
       }
   }
}