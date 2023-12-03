package accesodatos;

import entidades.Administrador;
import entidades.Consumidor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AdministradorDAO {
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    public List<Administrador> getListaAdministrador() {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        List<Administrador> administrador = em.createQuery("SELECT t FROM Administrador t", Administrador.class)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return administrador;
    }
    public void agregarAdministrador(Administrador administrador) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(administrador);
        em.getTransaction().commit();
        em.close();

    }
    public void borrarAdministrador(int idAdminsitrador) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        Administrador administrador = em.find(Administrador.class, idAdminsitrador);

        if (administrador != null) {
            em.remove(administrador);
        }

        em.getTransaction().commit();
        em.close();

    }
    public void actualizarAdministrador(Administrador administrador) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        em.merge(administrador);
        em.getTransaction().commit();
        em.close();

    }
    public Administrador buscarAdministrador(int idAdministrador) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Administrador administrador = em.find(Administrador.class, idAdministrador);
        em.getTransaction().commit();
        em.close();

        return administrador;

    }
}