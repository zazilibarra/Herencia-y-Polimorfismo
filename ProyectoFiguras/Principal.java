import java.util.ArrayList;
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
       
       for(Figura i : fig)
       {
          i.calculaArea();
       }
       
       int n = 1;
       for(Figura i : fig)
       {
          System.out. println("Area de figura " + n++ +" : " + i.accedeArea());
       }
    }
}
