package Entidades;

import java.time.LocalDateTime;

public class Salida {

    public String destino;
    public LocalDateTime horario;
    private Bus bus;
    private Persona[] pasajeros;
    private int cantidad;

    public Salida(String destino, LocalDateTime horario, Bus bus) {
        this.destino = destino;
        this.horario = horario;
        this.bus = bus;
        this.pasajeros = new Persona[this.bus.capacidad];
        this.cantidad = 0;
    }

    public boolean disponible(Persona p) {
        return this.horario.equals(p.horario) && this.destino.equals(p.destino) && (this.bus.capacidad > this.cantidad);
    }
    
    public boolean contains(Persona p) {
        for (int i = 0; i < this.bus.capacidad; i++) {
            if (this.pasajeros[i] != null && this.pasajeros[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public boolean addPasajeroAt(int index, Persona p) {
        if (disponible(p) && index < this.bus.capacidad && index >= 0 && this.pasajeros[index] == null) {
            this.pasajeros[index] = p;
            this.cantidad++;
            return true;
        }
        return false;
    }

    public boolean removePasajero(Persona p) {
        for (int i = 0; i < this.bus.capacidad; i++) {
            if (this.pasajeros[i].equals(p)) {
                this.pasajeros[i] = null;
                this.cantidad--;
                return true;
            }
        }
        return false;
    }

    public int[] asientosDisponibles() {
        int[] asientos = new int[this.bus.capacidad - this.cantidad];
        int index = 0;
        for (int i = 0; i < this.bus.capacidad; i++) {
            if (this.pasajeros[i] == null) {
                asientos[index] = i;
                index++;
            }
        }
        return asientos;
    }

    public boolean betweenTime(LocalDateTime t1, LocalDateTime t2) {
        return this.horario.isAfter(t1) && this.horario.isBefore(t2);
    }

    public float getPromedio() {
        return 100*this.cantidad/this.pasajeros.length;
    }

    public String getIDBus() {
        return this.bus.id;
    }

    @Override
    public String toString() {
        return this.destino + " " + this.horario.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Salida) {
            return ((Salida) obj).bus == this.bus && ((Salida) obj).horario == this.horario && ((Salida) obj).destino.equals(this.destino);
        }
        return false;
    }
}
