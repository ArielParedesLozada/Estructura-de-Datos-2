package Cooperativa;


import DataStructures.LinkedList;
import Entidades.Vehiculos.Vehiculo;

public class GestorVehiculos {
    public LinkedList<Vehiculo> vehiculos;

    public GestorVehiculos() {
        this.vehiculos = new LinkedList<>();
    }

    public boolean addBus(Vehiculo bus){
        if (!this.vehiculos.contains(bus)) {
            return this.vehiculos.add(bus);
        }
        return false;
    }
}
