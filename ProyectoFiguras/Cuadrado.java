
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float l)
    {
        lado = l;
    }
    
    public void calculaArea()
    {
        area = lado * lado;
    }
}