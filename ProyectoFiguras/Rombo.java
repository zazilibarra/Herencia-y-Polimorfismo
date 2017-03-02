import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Rombo extends Figura
{
    private float dMayor;
    private float dMenor;
    
    public Rombo(int x, int y, float ma, float me, Color color)
    {
        super(x,y,color);
        dMayor = ma;
        dMenor = me;
    }
    
    @Override
    public String toString()
    {
        return "Rombo : " + super.toString();
    }
    
    @Override
     public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        int [] pX = {super.dimeX(), super.dimeX() + ((int)dMenor/2), super.dimeX() + (int)dMenor, super.dimeX() + ((int)dMenor/2)};
        int [] pY = {super.dimeY(), super.dimeY()- ((int)dMayor/2),  super.dimeY(), super.dimeY() + ((int)dMayor/2)};
        g2.drawPolygon(pX, pY, 4);
        g2.setColor(super.dimeColor());
        g2.fillPolygon(pX, pY, 4);
    }
}