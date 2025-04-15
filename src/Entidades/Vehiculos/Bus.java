package Entidades.Vehiculos;

public class Bus implements Vehiculo {

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
    public int getCapacity() {
        return this.capacidad;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public boolean isEqual(Vehiculo vehiculo) {
        return this.id.equals(vehiculo.getID());
    }

    @Override
    public String getName() {
        return this.id + ": " + this.capacidad;
    }
}
