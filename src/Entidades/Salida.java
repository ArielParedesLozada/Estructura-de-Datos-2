package Entidades;

import java.time.LocalDateTime;

public class Salida {

    public String destino;
    public LocalDateTime horaSalida;
    public LocalDateTime horaLlegada;
    private Bus bus;
    private Persona[] pasajeros;
    private int cantidad;

    public Salida(String destino, LocalDateTime horaS, LocalDateTime horaL, Bus bus) {
        this.destino = destino;
        this.bus = bus;
        this.horaSalida = horaS;
        this.horaLlegada = horaL;
        this.pasajeros = new Persona[this.bus.capacidad];
        this.cantidad = 0;
    }
    
    public boolean comparaBusHorario(Salida s){
        return this.bus.equals(s.bus) && this.horaSalida.isBefore(s.horaLlegada) && this.horaLlegada.isAfter(s.horaSalida);
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
        if (this.cantidad < this.bus.capacidad && index < this.bus.capacidad && index >= 0 && this.pasajeros[index] == null) {
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
        return !horaSalida.isBefore(t1) && !horaLlegada.isAfter(t2);
    }

    public float getPromedio() {
        return 100 * this.cantidad / this.pasajeros.length;
    }

    public String getIDBus() {
        return this.bus.id;
    }

    @Override
    public String toString() {
        return  "destino: " + this.destino
                + ", horaSalida: " + this.horaSalida
                + ", horaLlegada: " + this.horaLlegada
                + ", bus ID: " + this.bus.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Salida) {
            return ((Salida) obj).bus == this.bus && 
                    ((Salida) obj).horaLlegada == this.horaLlegada && 
                    ((Salida) obj).horaSalida == this.horaSalida && 
                    ((Salida) obj).destino.equals(this.destino);
        }
        if (obj instanceof String) {
            return this.toString().equals(obj);
        }
        return false;
    }
}
