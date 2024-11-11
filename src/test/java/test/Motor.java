package test;

public class Motor {
    int numeroCilindros;
    int registro;
    String tipo;

    public int cambiarRegistro(int argumento)
    {
        this.registro = argumento;

        return registro;
    }
    public String asignarTipo(String argumento)
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
