import java.awt.Graphics;
import java.awt.Graphics2D;
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(int x, int y, float b, float a)
    {
        super(x,y);
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
    
     public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawLine(super.dimeX(), super.dimeY(), super.dimeX() + (int)base, super.dimeY());
        g2.drawLine(super.dimeX(), super.dimeY(), super.dimeX()/2, super.dimeY() + (int)altura);
        g2.drawLine(super.dimeX()/2, super.dimeY() + (int)altura, super.dimeX() + (int)base, super.dimeY());
    }
}
