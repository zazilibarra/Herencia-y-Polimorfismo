import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame
{
    private Lienzo dibujo;
    private Timer tiempo;
    
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho, alto);
        dibujo = new Lienzo();
        //dibujo.addKeyListener(dibujo);
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EscuchadorTeclado escuchadorTeclado = new EscuchadorTeclado();
        this.addKeyListener(escuchadorTeclado);
        
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        tiempo = new Timer(10, escuchaTiempo);
        tiempo.start();
    }  
    
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //System.out.println("Hola Pelota");
            //pelota.muevete(getBounds());
            //repaint();
            dibujo.actua();
        }
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyChar() == 'd')
            {
                tiempo.stop();
            }
            else if(e.getKeyChar() == 'i')
            {
                tiempo.start();
            }
            //System.out.println("keyPressed: " + e.getKeyChar());
        }
        
        @Override
        public void keyReleased(KeyEvent e)
        {
            //System.out.println("keyReleased : " + e.getKeyChar());
        }
        
        @Override
        public void keyTyped(KeyEvent e)
        {
            //System.out.println("keyTyped : " + e.getKeyChar());
        }
    }
}
