package Cooperativa;


import DataStructures.LinkedList;
import Entidades.Bus;

public class GestorBuses {
    public LinkedList<Bus> buses;

    public GestorBuses() {
        this.buses = new LinkedList<>();
    }

    public boolean addBus(Bus bus){
        if (!this.buses.contains(bus)) {
            return this.buses.add(bus);
        }
        return false;
    }
}
