package test;

public class Asiento {

    String color;
    int precio;
    int registro;

    public void cambiarColor(String argumento) {
        if (argumento.equals("rojo")) {
            color = "rojo";
        } else if (argumento.equals("verde")) {
            color = "verde";
        } else if (argumento.equals("amarillo")) {
            color = "amarillo";
        } else if (argumento.equals("negro")) {
            color = "negro";
        } else if (argumento.equals("blanco")) {
            color = "blanco";
        } else {
            // Es innecesario asignar color = color; aquí, ya que no cambia nada.
        }
    }
}

