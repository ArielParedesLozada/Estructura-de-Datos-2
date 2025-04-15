package Entidades;

import java.time.LocalDateTime;

import Entidades.Vehiculos.Vehiculo;

public class Salida {

    public String destino;
    public LocalDateTime horaSalida;
    public LocalDateTime horaLlegada;
    protected Vehiculo vehiculo;
    public Asientos asientos;

    public Salida(String destino, LocalDateTime horaS, LocalDateTime horaL, Vehiculo vehiculo) {
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.horaSalida = horaS;
        this.horaLlegada = horaL;
        this.asientos = new Asientos(this);
    }

    public boolean comparaVehiculoHorario(Salida s) {
        return this.vehiculo.equals(s.vehiculo) && this.horaSalida.isBefore(s.horaLlegada)
                && this.horaLlegada.isAfter(s.horaSalida);
    }

    public boolean betweenTime(LocalDateTime t1, LocalDateTime t2) {
        return !horaSalida.isBefore(t1) && !horaLlegada.isAfter(t2);
    }

    public String getIDVehiculo() {
        return this.vehiculo.getID();
    }

    @Override
    public String toString() {
        return "destino: " + this.destino
                + ", horaSalida: " + this.horaSalida
                + ", horaLlegada: " + this.horaLlegada
                + ", Vehiculo ID: " + this.vehiculo.getID();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Salida) {
            return ((Salida) obj).vehiculo == this.vehiculo &&
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
