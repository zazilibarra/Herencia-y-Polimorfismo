import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;

public class Pelota
{
    private int posX;
    private int posY;
    private int radio;
    private int dx;
    private int dy;
    
    public Pelota(int x, int y, int r)
    {
        posX = x;
        posY = y;
        radio = r;
        dx = 1;
        dy = 1; 
    }
    
    public void dibuja(Graphics g)
    {
        g.drawOval(posX, posY, radio*2, radio*2);
        g.setColor(Color.blue);
        g.fillOval(posX, posY, radio*2, radio*2);
    }
    
    public void muevete(Rectangle r)
    {
        //System.out.println("Mueve la pelota...");
        //System.out.println("Tamaño de la ventana: " + r.getWidth() + ", " + r.getHeight());
        
        posX += dx;
        posY += dy;
        if(posX >= r.getWidth() || posX <= radio)
        {
            dx *= -1;
        }
        if(posY >= r.getHeight() || posY <= radio)
        {
            dy *= -1;
        }
    }
}
