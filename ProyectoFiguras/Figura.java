import java.awt.Graphics;
public abstract class Figura
{
    protected float area;
    private int posX;
    private int posY;
    
    public Figura(int x, int y)
    {
        posX = x;
        posY = y;
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
    
    public abstract void dibuja(Graphics g);
}
