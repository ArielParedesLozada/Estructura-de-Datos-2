package Entidades;

import java.time.LocalDateTime;

public class Salida {

    public String destino;
    public LocalDateTime horaSalida;
    public LocalDateTime horaLlegada;
    public Bus bus;
    public Asientos asientos;

    public Salida(String destino, LocalDateTime horaS, LocalDateTime horaL, Bus bus) {
        this.destino = destino;
        this.bus = bus;
        this.horaSalida = horaS;
        this.horaLlegada = horaL;
        this.asientos = new Asientos(this);
    }

    public boolean comparaBusHorario(Salida s) {
        return this.bus.equals(s.bus) && this.horaSalida.isBefore(s.horaLlegada)
                && this.horaLlegada.isAfter(s.horaSalida);
    }

    public boolean betweenTime(LocalDateTime t1, LocalDateTime t2) {
        return !horaSalida.isBefore(t1) && !horaLlegada.isAfter(t2);
    }

    public String getIDBus() {
        return this.bus.id;
    }

    @Override
    public String toString() {
        return "destino: " + this.destino
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
