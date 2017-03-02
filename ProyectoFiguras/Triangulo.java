import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(int x, int y, float b, float a, Color color)
    {
        super(x,y,color);
        base = b; 
        altura = a;
    }
    
    public void calculaArea()
    {
        area = base * altura / 2;
    }
    
    @Override
    public String toString()
    {
        return "Triangulo : " + super.toString();
    }
    
    @Override
     public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        int [] pX = {super.dimeX(), super.dimeX() + (int)base, super.dimeX() + ((int)base/2)};
        int [] pY = {super.dimeY(), super.dimeY(), super.dimeY() - (int)altura};
        g2.drawPolygon(pX, pY, 3);
        g2.setColor(super.dimeColor());
        g2.fillPolygon(pX, pY, 3);
    }
}
