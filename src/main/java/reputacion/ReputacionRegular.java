package reputacion;
import entidades.Prestador;

public class ReputacionRegular implements Reputacion{

    public void ReputacionBuena(Prestador prestador) {
        if (prestador.getCalificacion() > 4)  {
            prestador.setReputacion(new ReputacionBuena());
        }
        System.out.println("El prestador ha pasado a tener una buena reputacion");
    }

    @Override
    public void ReputacionRegular(Prestador prestador) {
            System.out.println("El prestador ya tiene una reputacion regular");
    }

    @Override
    public void ReputacionMala(Prestador prestador) {
        if (prestador.getCalificacion() < 3)  {
            prestador.setReputacion(new ReputacionMala());
        }
        System.out.println("El prestador ha pasado a tener una mala reputacion");
    }
}
