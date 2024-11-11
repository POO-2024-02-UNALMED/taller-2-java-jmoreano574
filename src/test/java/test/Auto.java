package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;

    int cantidadAsientos() {
        int contador = 0;

        if (asientos != null) {
            for (Asiento asiento : asientos) {
                if (asiento != null) { 
                    contador++;
                }
            }
        }

        return contador;  
    }

    String verificarIntegridad() 
    {
        if (motor == null || motor.registro != registro) {
            return "Las piezas no son originales";
        }

        for (Asiento i : asientos) {
            if (i != null && i.registro != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
