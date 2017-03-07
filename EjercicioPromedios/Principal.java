public class Principal
{
   public static void main(String [] args)
   {
       Medible[] cuentas = new Medible[3];
       
       CuentaBancaria cb1 = new CuentaBancaria(100);
       CuentaBancaria cb2 = new CuentaBancaria(200);
       CuentaBancaria cb3 = new CuentaBancaria(300);
       
       cuentas.añadeCuenta(cb1);
       cuentas.añadeCuenta(cb2);
       cuentas.añadeCuenta(cb3);
       
       float prom = 
       System.out.println("Saldos Promedio: " + banco.calculaSaldo() );
       
       Medible[] paises = new Medible[3];
       
       Pais p1 = new Pais(25);
       Pais p2 = new Pais(32);
       Pais p3 = new Pais(94);
       
       paises.añadePais(p1);
       paises.añadePais(p2);
       paises.añadePais(p3);
       
        //System.out.println("Promedio de habitantes: " + planeta.calculaPromHabitantes() );*/
   }
}