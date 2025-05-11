package pe.edu.upc.wooftalkv1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Paseo")

public class Paseo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Descripcion", length = 60 , nullable = false)
    private String descripcion;

    @Column(name = "Fecha_inicio", nullable = false)
    private LocalDate fecha_inicio;

    @Column(name = "Fecha_fin", nullable = false)
    private LocalDate fecha_fin;

    @ManyToOne
    @JoinColumn(name = "Id_mascotas")
    private Mascotas mascotas;

    @ManyToOne
    @JoinColumn(name = "Id_Geolocalizacion")
    private Geolocalizacion geolocalizacion;

    @ManyToOne
    @JoinColumn(name = "Id_User")
    private  User user;

    public Paseo() {
    }

    public Paseo(int id, String descripcion, LocalDate fecha_inicio, LocalDate fecha_fin, Mascotas mascotas, Geolocalizacion geolocalizacion, User user) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.mascotas = mascotas;
        this.geolocalizacion = geolocalizacion;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Mascotas getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascotas mascotas) {
        this.mascotas = mascotas;
    }

    public Geolocalizacion getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(Geolocalizacion geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
