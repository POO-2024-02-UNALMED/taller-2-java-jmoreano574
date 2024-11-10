package test;

public class Asiento{

    String color;

    int precio;

    int registro;

    public void cambiarColor(String argumento)
    {
        if (argumento == "rojo")
        {
        color="rojo";
    }else if (argumento == "verde"){
        color="verde";
    }else if (argumento == "amarillo"){
        color="amarillo";
    }else if (argumento == "negro"){
        color="negro"; 
    }else if (argumento == "blanco"){
        color="blanco";
    }else{
        color=color;
    }  
}
}
