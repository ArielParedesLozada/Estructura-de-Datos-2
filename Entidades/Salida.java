package Entidades;

import java.time.LocalDateTime;

public class Salida {
    public String destino;
    public LocalDateTime horario;
    private Bus bus;

    public Salida(String destino, LocalDateTime horario, Bus bus){
        this.destino = destino;
        this.horario = horario;
        this.bus = bus;
    }

    public boolean disponible(Persona p){
        return this.horario.equals(p.horario) && this.destino.equals(p.destino) && this.bus.disponible();
    }
    
    public boolean addPasajeroAt(int index,Persona p){
        if (disponible(p)) {
            return this.bus.addPasajeroAt(index, p);
        }
        return false;
    }

    
}
