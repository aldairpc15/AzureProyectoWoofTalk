package pe.edu.upc.wooftalkv1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "Id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "Id_metodopago")
    private MetodoPago metodoPago;

    public Solicitud() {
    }

    public Solicitud(int id, LocalDate fecha, User user, MetodoPago metodoPago) {
        this.id = id;
        this.fecha = fecha;
        this.user = user;
        this.metodoPago = metodoPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
