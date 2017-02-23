import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String [] args)
   {
       ArrayList<Figura> fig = new ArrayList<Figura>();
       
       fig.add(new Triangulo(3, 4));
       fig.add(new Cuadrado(2));
       fig.add(new Circulo(3));
       
       Iterator<Figura> it = fig.iterator();
       
       while(it.hasNext())
       {
           Figura figura = it.next();
           figura.calculaArea();
       }
       
       Iterator<Figura> itt = fig.iterator();
       while(itt.hasNext())
       {
           Figura figura = itt.next();
           System.out.println(figura);
       }
    }
}
