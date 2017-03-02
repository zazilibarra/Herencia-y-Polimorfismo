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
       
       System.out.println("Saldos Promedio: " + banco.calculaSaldo() );
       
       Planeta planeta = new Planeta();
       
       Pais p1 = new Pais(25);
       Pais p2 = new Pais(32);
       Pais p3 = new Pais(94);
       
       planeta.añadePais(p1);
       planeta.añadePais(p2);
       planeta.añadePais(p3);
       
        System.out.println("Promedio de habitantes: " + planeta.calculaPromHabitantes() );
   }
}