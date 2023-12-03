package accesodatos;

import entidades.Contrato;
import entidades.Prestador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class PrestadorDAO {
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    public List<Prestador> getListaPrestador() {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        List<Prestador> prestador = em.createQuery("SELECT t FROM Prestador t", Prestador.class)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return prestador;
    }
    public void agregarPrestador(Prestador prestador) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(prestador);
        em.getTransaction().commit();
        em.close();

    }
    public void borrarPrestador(int idPrestador) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        Prestador prestador = em.find(Prestador.class, idPrestador);

        if (prestador != null) {
            em.remove(prestador);
        }

        em.getTransaction().commit();
        em.close();

    }
    public void actualizarPrestador(Prestador prestador) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        em.merge(prestador);
        em.getTransaction().commit();
        em.close();

    }
    public Prestador buscarPrestador(int idPrestador) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Prestador prestador = em.find(Prestador.class, idPrestador);
        em.getTransaction().commit();
        em.close();

        return prestador;
    }
}