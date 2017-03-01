import java.awt.Graphics;
import java.awt.Color;
public abstract class Figura
{
    protected float area;
    private int posX;
    private int posY;
    private Color color;
    
    public Figura(int x, int y, Color col);
    {
        posX = x;
        posY = y;
        color = col;
        //area = 0;
    }
    
    public float accedeArea()
    {
        return area;
    }
    
    public void calculaArea()
    {
        System.out.println("Ups!");
    }

    @Override
    public String toString()
    {
        return "" + area;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return this.area == ((Figura)obj).area;
    }
    
    protected int dimeX()
    {
        return posX;
    }
    
    protected int dimeY()
    {
        return posY;
    }
    
    public Color dimeColor()
    {
        return color;
    }
    
    public abstract void dibuja(Graphics g);
}
