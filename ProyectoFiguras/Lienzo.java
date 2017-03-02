import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;
public class Lienzo extends JPanel
{
   private ArrayList<Figura> figuras = new ArrayList<Figura>();
   public Lienzo()
   {     
       Color col = new Color (249, 3, 4);
       Triangulo t1 = new Triangulo(70, 300, 100, 80, col);
       col = new Color (249, 200, 4);
       Circulo c1 = new Circulo(240, 200, 100, col);
       col = new Color (77,21,33);
       Cuadrado s1 = new Cuadrado(430, 200, 100, col);
       col = new Color (4, 228, 66);
       Rombo r1 = new Rombo(600, 250, 100, 100, col);
       
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