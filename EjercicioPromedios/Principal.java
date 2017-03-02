public class Principal
{
   public static void main(String [] args)
   {
       Banco banco = new Banco();
       
       CuentaBancaria cb1 = new CuentaBancaria(100);
       CuentaBancaria cb2 = new CuentaBancaria(200);
       CuentaBancaria cb3 = new CuentaBancaria(300);
       
       banco.añadeCuenta(cb1);
       banco.añadeCuenta(cb2);
       banco.añadeCuenta(cb3);
       
       System.out.println("El promedio de los saldos de cuentas bancarias es: " + banco.calculaSaldo() );
   }
}