package pe.edu.upc.wooftalkv1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Mascotas")

public class Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre", length = 30, nullable = false)
    private String nombre;

    @Column(name = "Raza", length = 30, nullable = false)
    private String raza;

    @Column(name = "Edad", nullable = false)
    private int edad;

    @Column(name = "Tamanio", length = 30, nullable = false)
    private String tamanio;

    @Column(name = "Observaciones", length = 60 , nullable = false)
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "Id_user")
    private User user;

    public Mascotas() {
    }

    public Mascotas(int id, String nombre, String raza, int edad, String tamanio, String observaciones, User user) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.observaciones = observaciones;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
