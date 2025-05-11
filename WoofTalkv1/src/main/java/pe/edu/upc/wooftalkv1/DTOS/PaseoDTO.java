package pe.edu.upc.wooftalkv1.DTOS;

import pe.edu.upc.wooftalkv1.entities.Geolocalizacion;
import pe.edu.upc.wooftalkv1.entities.Mascotas;
import pe.edu.upc.wooftalkv1.entities.User;

import java.time.LocalDate;

public class PaseoDTO {
    private int id;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Mascotas mascotas;
    private Geolocalizacion geolocalizacion;
    private User user;

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

    public Mascotas getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascotas mascotas) {
        this.mascotas = mascotas;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
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
