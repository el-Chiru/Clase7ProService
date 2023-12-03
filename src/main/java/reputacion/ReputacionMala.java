package reputacion;
import entidades.Prestador;


public class ReputacionMala implements Reputacion{

    @Override
    public void ReputacionBuena(Prestador prestador) {
        System.out.println("El prestador primero tendra que tener una reputacion regular");
    }

    @Override
    public void ReputacionRegular(Prestador prestador) {
        if (prestador.getCalificacion() > 2) {
            prestador.setReputacion(new ReputacionRegular());}
        System.out.println("El prestador ha pasado a tener una reputacion regular");
    }

    @Override
    public void ReputacionMala(Prestador prestador) {
        System.out.println("El prestador ya tiene una reputacion mala");

    }
}
