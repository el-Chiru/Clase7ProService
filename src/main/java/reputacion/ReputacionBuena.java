package reputacion;
import entidades.Prestador;


public class ReputacionBuena implements Reputacion{
private Prestador prestador;
    @Override
    public void ReputacionBuena(Prestador prestador) {
System.out.println("El prestador ya tiene una buena reputacion");
    }

    @Override
    public void ReputacionRegular(Prestador prestador) {
        if (prestador.getCalificacion() < 4) {
        prestador.setReputacion(new ReputacionRegular());}
        System.out.println("El prestador ha pasado a tener una reputacion regular");
    }

    @Override
    public void ReputacionMala(Prestador prestador) {
        System.out.println("Primero debo tener una reputacion regular");

    }
}
