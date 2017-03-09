import java.awt.Graphics;
public class Pelota
{
    private int posX;
    private int posY;
    private int radio;
    
    public Pelota(int x, int y, int r)
    {
        posX = x;
        posY = y;
        radio = r;
    }
    
    public void dibuja(Graphics g)
    {
        g.drawOval(posX, posY, radio*2, radio*2);
    }
}
