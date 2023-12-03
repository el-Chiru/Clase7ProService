package accesodatos;

import entidades.Contrato;
import entidades.Contrato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ContratoDAO {
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    public List<Contrato> getListaContrato() {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        List<Contrato> contrato = em.createQuery("SELECT t FROM Contrato t", Contrato.class)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return contrato;
    }
    public void agregarContrato(Contrato contrato) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(contrato);
        em.getTransaction().commit();
        em.close();

    }
    public void borrarContrato(int idContrato) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        Contrato contrato = em.find(Contrato.class, idContrato);

        if (contrato != null) {
            em.remove(contrato);
        }

        em.getTransaction().commit();
        em.close();

    }
    public void actualizarContrato(Contrato contrato) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        em.merge(contrato);
        em.getTransaction().commit();
        em.close();

    }
    public Contrato buscarContrato(int idContrato) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Contrato contrato = em.find(Contrato.class, idContrato);
        em.getTransaction().commit();
        em.close();

        return contrato;

    }
}

