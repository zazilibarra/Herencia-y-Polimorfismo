import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lienzo extends JPanel //implements KeyListener
{
    private Pelota pelota;
    
    public Lienzo()
    {
        pelota = new Pelota(100, 100, 15);
        //this.addKeyListener(this);
    }
       
    public void actua()
    {
        pelota.muevete(this.getBounds());
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibuja(g);
    }
}
