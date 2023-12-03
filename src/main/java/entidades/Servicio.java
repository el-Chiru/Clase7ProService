package entidades;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "Servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    @Column(name = "idServicio")
private int idServicio;
    @Id
    @Column(name = "idPrestador")
private int idPrestador;
    @Basic
    @Column(name = "descripcionDelServicio")
private char descripcionDelServicio;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<Contrato> contratos;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<Prestador> prestadores;
public Servicio(){

}
    public Servicio(int idServicio, int idPrestador, char descripcionDelServicio) {
        this.idServicio = idServicio;
        this.idPrestador = idPrestador;
        this.descripcionDelServicio = descripcionDelServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public char getdescripcionDelServicio() {
        return descripcionDelServicio;
    }

    public void setdescripcionDelServicio(char descripcionDelServicio) {
       this.descripcionDelServicio = descripcionDelServicio;
    }
    public String toString() { return "Servicio{" + "idServicio =" + idServicio + ", idPrestador =" + idPrestador + "Descripcion Del Servicio =" + descripcionDelServicio;
}
}