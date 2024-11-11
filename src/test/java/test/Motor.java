package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    public int cambiarRegistro(int argumento) {
        this.registro = argumento;
        return argumento;
    }

    public String asignarTipo(String argumento) {
        if (argumento.equals("electrico")) {
            tipo = "electrico";
        } else if (argumento.equals("gasolina")) {
            tipo = "gasolina";
        } else {
            return tipo=tipo;
        }
        return null;
    }
}
