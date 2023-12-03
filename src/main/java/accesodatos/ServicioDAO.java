package accesodatos;

import entidades.Prestador;
import entidades.Servicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ServicioDAO {
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    public List<Servicio> getListaServicio() {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        List<Servicio> servicio = em.createQuery("SELECT t FROM Servicio t", Servicio.class)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return servicio;
    }
    public void agregarServicio(Servicio servicio) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(servicio);
        em.getTransaction().commit();
        em.close();

    }
    public void borrarServicio(int idServicio) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        Servicio servicio = em.find(Servicio.class, idServicio);

        if (servicio != null) {
            em.remove(servicio);
        }

        em.getTransaction().commit();
        em.close();

    }
    public void actualizarServicio(Servicio servicio) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        em.merge(servicio);
        em.getTransaction().commit();
        em.close();

    }
    public Servicio buscarServicio(int idServicio) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Servicio servicio = em.find(Servicio.class, idServicio);
        em.getTransaction().commit();
        em.close();

        return servicio;
    }
}