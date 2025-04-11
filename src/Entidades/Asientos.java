package Entidades;

public class Asientos {
    private Persona[] pasajeros;
    private int capacidad;
    private int cantidad;

    public Asientos(Salida salida) {
        this.pasajeros = new Persona[salida.bus.capacidad];
        this.capacidad = salida.bus.capacidad;
        this.cantidad = 0;
    }

    public boolean contains(Persona p) {
        for (int i = 0; i < this.capacidad; i++) {
            if (this.pasajeros[i] != null && this.pasajeros[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public boolean addPasajeroAt(int index, Persona p) {
        if (this.cantidad < this.capacidad && index < this.capacidad && index >= 0
                && this.pasajeros[index] == null) {
            this.pasajeros[index] = p;
            this.cantidad++;
            return true;
        }
        return false;
    }

    public boolean removePasajero(Persona p) {
        for (int i = 0; i < this.capacidad; i++) {
            if (this.pasajeros[i].equals(p)) {
                this.pasajeros[i] = null;
                this.cantidad--;
                return true;
            }
        }
        return false;
    }

    public int[] asientosDisponibles() {
        int[] asientos = new int[this.capacidad - this.cantidad];
        int index = 0;
        for (int i = 0; i < this.capacidad; i++) {
            if (this.pasajeros[i] == null) {
                asientos[index] = i;
                index++;
            }
        }
        return asientos;
    }

    public float getPromedio() {
        return 100 * this.cantidad / this.capacidad;
    }
}
