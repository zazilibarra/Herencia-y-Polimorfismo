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
        Pais[] arrPaises = new Pais[paises.size()];
        arrPaises = paises.toArray(arrPaises);
        return Utileria.calculaPromedio(arrPaises);
    }
}
