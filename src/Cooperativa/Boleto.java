package Cooperativa;

import Entidades.Persona;
import Entidades.Salida;

public class Boleto {
    protected String idPersona;
    protected Salida salida;

    public Boleto(Persona p, Salida salida) {
        this.idPersona = p.id;
        this.salida = salida;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Boleto) ? this.idPersona.equals(((Boleto)obj).idPersona) : this.idPersona.equals(obj);
    }

    @Override
    public String toString() {
        return this.idPersona + " " + this.salida.destino;
    }

}
