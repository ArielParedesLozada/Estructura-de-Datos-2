package Cooperativa;

import DataStructures.LinkedList;
import DataStructures.TablaHash;
import Entidades.Bus;
import Entidades.Persona;
import Entidades.Salida;

public class GestorDatos {
    public LinkedList<Bus> buses;
    public LinkedList<Salida> salidas;
    public TablaHash<String, Salida> registro;
    private static GestorDatos instance;
    
    private GestorDatos(){
        this.buses = new LinkedList<>();
        this.salidas = new LinkedList<>();
        this.registro = new TablaHash<>();
    }

    public static GestorDatos iniciaGestor(){
        if (instance == null) {
            instance = new GestorDatos();
        }
        return instance;
    }

    public boolean addBus(Bus bus){
        if (!this.buses.contains(bus)) {
            return this.buses.add(bus);
        }
        return false;
    }

    public boolean addSalida(Salida salida){
        for (Salida salda : this.salidas) {
            if (salda.comparaBusHorario(salida)) {
                return false;
            }
        }
        return this.salidas.add(salida);
    }

    public boolean addBoleto(Persona p, Salida s){
        return this.registro.addValue(p.id, s);
    }
    
    public boolean removeSalida(Salida s){
        return this.salidas.remove(s);
    }
}
