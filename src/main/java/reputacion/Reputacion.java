package reputacion;

import entidades.Prestador;

public interface Reputacion {
    void  ReputacionBuena(Prestador prestador);
    void  ReputacionRegular(Prestador prestador);
    void ReputacionMala(Prestador prestador);
}
