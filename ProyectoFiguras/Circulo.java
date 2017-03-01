import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(int x, int y, float r,  Color color)
    {
        super(x,y, color);
        radio = r;
    }
    
    public void calculaArea()
    {
        area = (float)3.1416*(float)Math.pow(radio, 2);
    }
    
    @Override
    public String toString()
    {
        return "Circulo :" + super.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Circulo)
        {
        return this.radio == ((Circulo)obj).radio;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawOval(super.dimeX(), super.dimeY(), (int)radio, (int)radio);
    }
}