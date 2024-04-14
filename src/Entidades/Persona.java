package Entidades;

import java.time.LocalDateTime;

public class Persona {
    public String id;
    public String nombre, apellido;
    public String destino;
    public LocalDateTime horario;

    public Persona(String id, String nombre, String apellido, String destino, LocalDateTime horario){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.destino = destino;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return this.id+" "+this.nombre+" "+this.apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Persona) ? this.id.equals(((Persona) obj).id) : this.id.equals(obj);
    }
}
