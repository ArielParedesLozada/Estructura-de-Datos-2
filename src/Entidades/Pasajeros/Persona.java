package Entidades.Pasajeros;

import java.util.Objects;

public class Persona implements Pasajero {
    private String id;
    private String nombre, apellido;

    public Persona(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.id + " " + this.nombre + " " + this.apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Persona) {
            return this.id.equals(((Persona) obj).id);
        }
        return this.id.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean isEqual(Pasajero pasajero) {
        return this.id.equals(pasajero.getID());
    }

    @Override
    public String getName() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String getID() {
        return this.id;
    }
}
