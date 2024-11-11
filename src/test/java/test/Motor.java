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
        switch (argumento) {
            case "electrico" -> tipo = "electrico";
            case "gasolina" -> tipo = "gasolina";
            default -> {
                return tipo;
            }
        }
        return null;
    }
}
