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
       Ventana vent = new Ventana(800, 600);
        vent.setVisible(true);
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
       /*
       Iterator<Figura> itt = fig.iterator();
       while(itt.hasNext())
       {
           Figura figura = itt.next();
           System.out.println(figura);
       }
       
       
    }
    
    Triangulo t1 = new Triangulo(4,5);
    Circulo c1 = new Circulo(3);
    Circulo c2 = new Circulo(3);
    
    if(c1.equals(t1))
    {
        System.out.println("Iguales");
    }
    else
    {
        System.out.println("Diferentes");
    }2*/
   }
}
