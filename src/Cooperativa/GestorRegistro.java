package Cooperativa;

import java.util.HashSet;

import DataStructures.LinkedList;
import DataStructures.TablaHash;
import Entidades.Salida;
import Entidades.Pasajeros.Pasajero;

public class GestorRegistro {
    public TablaHash<String, Salida> registro;

    public GestorRegistro() {
        this.registro = new TablaHash<>();
    }

    public boolean addBoleto(Pasajero p, Salida s) {
        return this.registro.addValue(p.getID(), s);
    }

    public HashSet<String> getDestinos(LinkedList<Salida> salidas) {
        HashSet<String> destinos = new HashSet<>();
        for (Salida salida : salidas) {
            if (!destinos.contains(salida.destino)) {
                destinos.add(salida.destino);
            }
        }
        return destinos;
    }

}
