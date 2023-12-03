package accesodatos;
import entidades.Consumidor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class ConsumidorDAO {
        private EntityManager getEntityManager() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
            EntityManager manager = factory.createEntityManager();
            return manager;
        }
    public List<Consumidor> getListaConsumidor() {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        List<Consumidor> consumidores = em.createQuery("SELECT t FROM Consumidor t", Consumidor.class)
                .getResultList();

        em.getTransaction().commit();
        em.close();

        return consumidores;
    }
    public void agregarConsumidor(Consumidor consumidor) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(consumidor);
        em.getTransaction().commit();
        em.close();

    }
    public void borrarConsumidor(int idConsumidor) {

        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        Consumidor consumidor = em.find(Consumidor.class, idConsumidor);

        if (consumidor != null) {
            em.remove(consumidor);
        }

        em.getTransaction().commit();
        em.close();

    }
    public void actualizarConsumidor(Consumidor consumidor) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        em.merge(consumidor);
        em.getTransaction().commit();
        em.close();

    }
    public Consumidor buscarConsumidor(int idConsumidor) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Consumidor consumidor = em.find(Consumidor.class, idConsumidor);
        em.getTransaction().commit();
        em.close();

        return consumidor;

    }
}
