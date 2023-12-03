package entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Consumidor")
public class Consumidor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "idConsumidor")
    private int idConsumidor;
    @OneToMany(mappedBy = "Consumidor", cascade = CascadeType.ALL)
    private List<Contrato> contratos;

    public Consumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }
    public String toString() { return "Consumidor{" + "idConsumidor=" + idConsumidor;
}
}