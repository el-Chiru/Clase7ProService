package entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "idContrato")
    private int idContrato;
    @Id
    @Column(name = "idConsumidor")
    private int idConsumidor;
    @Id
    @Column(name = "idPrestador")
    private int idPrestador;
    @Id
    @Column(name = "idServicio")
    private int idServicio;
    @Column
    @Basic
    private char Dias;
    @Column
    private int Horarios;
    @Column
    private char DescripcionDelTrabajo;
    @Column
    private boolean Finalizado;

    @ManyToOne
    @JoinColumn(name = "idConsumidor")
    private Consumidor consumidor;
    @ManyToOne
    @JoinColumn(name = "idPrestador", referencedColumnName = "cuit")
    private Prestador prestador;
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private Servicio servicio;

        public Contrato(int idContrato, int idConsumidor, int idPrestador, int idServicio, char dias, int horarios, char descripcionDelTrabajo, boolean finalizado) {
        this.idContrato = idContrato;
        this.idConsumidor = idConsumidor;
        this.idPrestador = idPrestador;
        this.idServicio = idServicio;
        this.Dias = dias;
        this.Horarios = horarios;
        this.DescripcionDelTrabajo = descripcionDelTrabajo;
        this.Finalizado = finalizado;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public char getDias() {
        return Dias;
    }

    public void setDias(char dias) {
        Dias = dias;
    }

    public int getHorarios() {
        return Horarios;
    }

    public void setHorarios(int horarios) {
        Horarios = horarios;
    }

    public char getDescripcionDelTrabajo() {
        return DescripcionDelTrabajo;
    }

    public void setDescripcionDelTrabajo(char descripcionDelTrabajo) {
        DescripcionDelTrabajo = descripcionDelTrabajo;
    }

    public boolean isFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        Finalizado = finalizado;
    }

    public String toString() { return "Contrato{" + "idContrato =" + idContrato + ", idConsumidor =" + idConsumidor + "idPrestador=" + idPrestador + "idServicio=" + idServicio + "Finalizado=" + Finalizado;}

    }
