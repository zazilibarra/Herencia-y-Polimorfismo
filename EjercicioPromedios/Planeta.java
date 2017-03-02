import java.util.ArrayList;
import java.util.Iterator;
public class Planeta
{
    private ArrayList<Pais>paises;
    public Planeta()
    {
        paises = new ArrayList<Pais>();
    }
    
    public void añadePais(Pais p)
    {
        paises.add(p);
    }
    
    public float calculaPromHabitantes()
    {
        float habitantes = 0;
        Iterator<Pais> it = paises.iterator();
       
        while(it.hasNext())
         {
             Pais pais = it.next();
             habitantes += (float)pais.dimeHabitantes();
         }
        
         return habitantes/paises.size();
    }
}
