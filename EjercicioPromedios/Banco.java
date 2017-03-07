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
    
    public float calculaPromedio()
    {
        CuentaBancaria[] arrCuentas = new CuentaBancaria[cuentas.size()];
        arrCuentas = cuentas.toArray(arrCuentas);
        return Utileria.calculaPromedio(arrCuentas);
    }   
}
