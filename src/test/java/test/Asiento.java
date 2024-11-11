package test;

public class Asiento {

    String color;
    int precio;
    int registro;

    String cambiarColor(String argumento) 
    {
        if (argumento.equals("rojo") || argumento.equals("verde") || argumento.equals("amarillo") || argumento.equals("negro") || argumento.equals("blanco"))
        {
            return this.color=argumento;
        } else{
            return color;
        }
    }

}
