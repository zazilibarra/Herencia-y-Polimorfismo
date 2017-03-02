import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(int x, int y, float l, Color color)
    {
        super(x,y,color);
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
    
    @Override
     public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.drawRect(super.dimeX(), super.dimeY(), (int)lado, (int)lado);
        g2.setColor(super.dimeColor());
        g2.fillRect(super.dimeX(), super.dimeY(), (int)lado, (int)lado);
    }
}