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
            this.tipo = argumento;
        } else if (argumento.equals("gasolina")) {
            this.tipo = argumento;
        } else {
            this.tipo = tipo;
        }
    }
}
