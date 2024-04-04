package Cooperativa;

import Entidades.Persona;
import Entidades.Salida;

public class Boleto {
    protected String idPersona;
    protected Salida salida;

    public Boleto(Persona p, Salida salida){
        this.idPersona = p.id;
        this.salida = salida;
    }

}
