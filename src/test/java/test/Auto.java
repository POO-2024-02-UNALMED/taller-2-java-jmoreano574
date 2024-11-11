package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;

    public int cantidadAsientos() {
        int contador = 0;  

        for (Asiento asiento : asientos) {
            if (asiento != null) { 
                contador++;
            }
        }

        return contador;  
    }

    public boolean verificarIntegridad() {
    
        if (motor == null || motor.registro != registro) {
            return false;
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return false;
            }
        }

        return true; 
    }
}

class Asiento {
    int registro;

    public Asiento(int registro) {
        this.registro = registro;
    }
}

class Motor {
    int registro;

    public Motor(int registro) {
        this.registro = registro;
    }
}
