import java.util.ArrayList;
import java.util.Iterator;
public class Banco
{
    private ArrayList<CuentaBancaria>cuentas;
    
    public Banco()
    {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void añadeCuenta(CuentaBancaria cb)
    {
        cuentas.add(cb);
    }
    
    public float calculaSaldo()
    {
        float saldoProm = 0;
        Iterator<CuentaBancaria> it = cuentas.iterator();
       
        while(it.hasNext())
         {
             CuentaBancaria cuenta = it.next();
             saldoProm += (float)cuenta.dimeSaldo();
         }
        
         return saldoProm/cuentas.size();
    }
}
