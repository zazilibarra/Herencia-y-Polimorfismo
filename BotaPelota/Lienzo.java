import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle;

public class Lienzo extends JPanel //implements KeyListener
{
    private LinkedList<Pelota> pelotas;
    
    public Lienzo()
    {
        pelotas = new LinkedList<Pelota>();
        pelotas.add(new Pelota(100, 100, 15));
        EscuchadorMouse escuchadorMouse = new EscuchadorMouse();
        this.addMouseListener(escuchadorMouse);
        //this.addKeyListener(this);
    }
       
    public void actua()
    {
        Rectangle r = this.getBounds();
        for(Pelota p: pelotas)
        {
            p.muevete(r);
        }
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Pelota p: pelotas)
        {
            p.dibuja(g);
        }
    }
    
    class EscuchadorMouse extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int tamRandom = 10 + (int)(Math.random() * 20);
            Pelota pelotaNueva = new Pelota(e.getX(), e.getY(), tamRandom);        
            pelotas.add(pelotaNueva);
        }
    }
}
