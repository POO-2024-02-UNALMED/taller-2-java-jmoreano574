package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    int cambiarRegistro(int argumento)
    {
        this.registro = argumento;

        return registro;
    }
    String asignarTipo(String argumento)
    {
        if (argumento.equals("electrico") || argumento.equals("gasolina"))
        {
            return this.tipo = argumento;
        }else 
        {
            return this.tipo;
        }
    }
}
