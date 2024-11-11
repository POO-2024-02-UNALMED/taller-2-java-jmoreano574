package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    public void cambiarRegistro(int argumento) {
        this.registro = argumento;
    }

    public void asignarTipo(String argumento) {
        if (argumento.equals("electrico")) {
            tipo = argumento;
        } else if (argumento.equals("gasolina")) {
            tipo = argumento;
        } else {
        }
    }
}
