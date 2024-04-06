package Entidades;

public class Bus {
    public String id;
    private int pasajeros;
    private Persona[] personas;

    public Bus(String id, int capacidad) {
        this.id = id;
        this.personas = new Persona[capacidad];
        this.pasajeros = 0;
    }

    public boolean disponible() {
        return this.pasajeros < this.personas.length;
    }

    public boolean contains(Persona p) {
        for (int i = 0; i < this.personas.length; i++) {
            if (this.personas[i] != null && this.personas[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public boolean addPasajeroAt(int index, Persona p) {
        if (index < this.personas.length && index >= 0 && this.personas[index] == null && !contains(p)) {
            this.personas[index] = p;
            this.pasajeros++;
            return true;
        }
        return false;
    }

    public boolean outPasajero(Persona p) {
        for (int i = 0; i < this.personas.length; i++) {
            if (this.personas[i].equals(p)) {
                this.personas[i] = null;
                this.pasajeros--;
                return true;
            }
        }
        return false;
    }

    public float promedio() {
        return (this.pasajeros > 0) ? (this.pasajeros / this.personas.length) : 0;
    }

    public int[] asientosDisponibles() {
        int[] asientos = new int[this.personas.length - this.pasajeros];
        int index = 0;
        for (int i = 0; i < this.personas.length; i++) {
            if (this.personas[i] == null) {
                asientos[index] = i;
                index++;
            }
        }
        return asientos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Bus other) ? this.id.equals(other.id) : this.id.equals(obj);
    }
}
