package test;
public class Auto 
{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;

    int cantidadAsientos() 
    {
        int contador = 0;  

        for (Asiento i : asientos) 
        {
            if (i != null) 
            { 
                contador++;
            }
        }

        return contador;  
    }
}
