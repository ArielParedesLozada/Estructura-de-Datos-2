package Cooperativa;

import DataStructures.LinkedList;
import Entidades.Bus;
import Entidades.Persona;
import Entidades.Salida;

public class GestorDatos {
    public LinkedList<Bus> buses;
    public LinkedList<Salida> salidas;
    public LinkedList<Boleto> boletos;
    private static GestorDatos instance;
    
    private GestorDatos(){
        this.buses = new LinkedList<>();
        this.boletos = new LinkedList<>();
        this.salidas = new LinkedList<>();
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
        if (!this.salidas.contains(salida)) {
            return this.salidas.add(salida);
        }
        return false;
    }

    public boolean addBoleto(Persona p, Salida s){
        Boleto nuevo = new Boleto(p, s);
        return this.boletos.add(nuevo);
    }

    public boolean removeSalida(Salida s){
        return this.salidas.remove(s);
    }
}
