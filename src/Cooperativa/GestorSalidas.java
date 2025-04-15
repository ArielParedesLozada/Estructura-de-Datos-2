package Cooperativa;

import DataStructures.LinkedList;
import Entidades.Salida;

public class GestorSalidas {
    public LinkedList<Salida> salidas;

    public GestorSalidas() {
        this.salidas = new LinkedList<>();
    }

    public boolean addSalida(Salida salida){
        for (Salida salda : this.salidas) {
            if (salda.comparaVehiculoHorario(salida)) {
                return false;
            }
        }
        return this.salidas.add(salida);
    }

    public boolean removeSalida(Salida s){
        return this.salidas.remove(s);
    }
}
