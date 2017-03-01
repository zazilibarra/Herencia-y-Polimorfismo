import java.awt.Graphics;
import java.awt.Graphics2D;
public class Rombo extends Figura
{
    private float dMayor;
    private float dMenor;
    
    public Rombo(int x, int y, float ma, float me)
    {
        super(x,y);
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
        g2.drawLine(super.dimeX(), super.dimeY(), super.dimeX() + ((int)dMenor/2), super.dimeY()- ((int)dMayor/2));
        g2.drawLine(super.dimeX() + ((int)dMenor/2), super.dimeY()- ((int)dMayor/2), super.dimeX() + (int)dMenor, super.dimeY());
        g2.drawLine( super.dimeX() + (int)dMenor, super.dimeY(), super.dimeX() + ((int)dMenor/2), super.dimeY() + ((int)dMayor/2));
        g2.drawLine(super.dimeX() + ((int)dMenor/2), super.dimeY() + ((int)dMayor/2), super.dimeX(), super.dimeY());
    }
}