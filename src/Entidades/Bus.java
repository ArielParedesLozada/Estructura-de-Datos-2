package Entidades;

import java.util.Objects;

public class Bus {

    public String id;
    protected int capacidad;

    public Bus(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return this.id + " " + this.capacidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Bus) ? this.id.equals(((Bus) obj).id) : this.id.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }
}
