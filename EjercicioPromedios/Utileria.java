
public class Utileria
{
    public static float calculaPromedio(Medible[] coleccion)
    {
        float suma = 0;
        for(Medible elemento : coleccion)
        {
             suma += (float)elemento.obtenerMedida();
        }
        return suma/coleccion.length;
    }
}
