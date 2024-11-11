import java.util.Arrays;
import java.util.List;

public class Motor {
    private static final List<String> tiposPosibles = Arrays.asList("electrico", "gasolina");
    private int numeroCilindros;
    private String tipo;
    private int registro;

    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipo) {
        if (tiposPosibles.contains(tipo)) {
            this.tipo = tipo;
        }
    }
}
