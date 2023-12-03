package entidades;

import jakarta.persistence.*;
import reputacion.Reputacion;
import reputacion.ReputacionBuena;
import reputacion.ReputacionMala;
import reputacion.ReputacionRegular;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "Prestador")
public class Prestador {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    @Column(name = "cuit")
    private int cuit;
    @Basic
    @Column(name = "fotoPerfil")
    private int fotoPerfil;
    @Column(name = "apellido")
    private char apellido;
    @Column(name = "nombre")
    private char nombre;
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "tipoDocumento")
    @Basic
    private char tipoDocumento;
    @Column(name = "nroDocumento")
    private int nroDocumento;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "email")
    private char email;
    @Column(name = "dias")
    private char dias;
    @Column(name = "horarios")
    private char horarios;
    @Column(name = "coberturaKm")
    private int coberturaKm;
    @Column(name = "descripcion")
    private char descripcion;
    @Column(name = "fotos")
    private char fotos;
    @Column(name = "calificacion")
    private int calificacion;
    @Column(name = "reputacion")
    private Reputacion reputacion;

    @OneToMany(mappedBy = "prestador", cascade = CascadeType.ALL)
    private List<Contrato> contratos;
    @OneToMany(mappedBy = "prestador", cascade = CascadeType.ALL)
    private List<Servicio> servicios;
    public Prestador(int fotoPerfil, char apellido, char nombre, Date fechaNacimiento, char tipoDocumento, int nroDocumento, int cuit, int telefono, char email, char dias, char horarios, int coberturaKm, char descripcion, char fotos, int calificacion, Reputacion reputacion) {
        this.fotoPerfil = fotoPerfil;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.cuit = cuit;
        this.telefono = telefono;
        this.email = email;
        this.dias = dias;
        this.horarios = horarios;
        this.coberturaKm = coberturaKm;
        this.descripcion = descripcion;
        this.fotos = fotos;
        this.calificacion = calificacion;
        this.reputacion = reputacion;
    }

    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public char getApellido() {
        return apellido;
    }

    public void setApellido(char apellido) {
        this.apellido = apellido;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(char tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getDias() {
        return dias;
    }

    public void setDias(char dias) {
        this.dias = dias;
    }

    public char getHorarios() {
        return horarios;
    }

    public void setHorarios(char horarios) {
        this.horarios = horarios;
    }

    public int getCoberturaKm() {
        return coberturaKm;
    }

    public void setCoberturaKm(int coberturaKm) {
        this.coberturaKm = coberturaKm;
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }

    public char getFotos() {
        return fotos;
    }

    public void setFotos(char fotos) {
        this.fotos = fotos;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Reputacion getReputacion() {
        return reputacion;
    }

    public void setReputacion(Reputacion reputacion) {
        this.reputacion = reputacion;
    }
}
