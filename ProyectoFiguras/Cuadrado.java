import java.awt.Graphics;
import java.awt.Graphics2D;
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(int x, int y, float l)
    {
        super(x,y);
        lado = l;
    }
    
    public void calculaArea()
    {
        area = lado * lado;
    }
    
    @Override
    public String toString()
    {
        return "Cuadrado : " + super.toString();
    }
    
     public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawRect(super.dimeX(), super.dimeY(), (int)lado, (int)lado);
    }
}