package Cooperativa;

import java.util.HashSet;

public class GestorDatos {
    public GestorVehiculos gestorBuses;
    public GestorSalidas gestorSalidas;
    public GestorRegistro gestorRegistro;
    private static GestorDatos instance;
    
    private GestorDatos(){
        this.gestorBuses = new GestorVehiculos();
        this.gestorSalidas = new GestorSalidas();
        this.gestorRegistro = new GestorRegistro();
    }

    public static GestorDatos iniciaGestor(){
        if (instance == null) {
            instance = new GestorDatos();
        }
        return instance;
    }

    public HashSet<String> getDestinos(){
        return this.gestorRegistro.getDestinos(this.gestorSalidas.salidas);
    } 
}
