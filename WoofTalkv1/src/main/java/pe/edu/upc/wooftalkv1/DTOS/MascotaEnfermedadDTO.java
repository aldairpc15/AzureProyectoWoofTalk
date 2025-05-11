package pe.edu.upc.wooftalkv1.DTOS;

import pe.edu.upc.wooftalkv1.entities.Enfermedad;
import pe.edu.upc.wooftalkv1.entities.Mascotas;

public class MascotaEnfermedadDTO {

    private int id;

    private Mascotas mascota;

    private Enfermedad enfermedad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }
}
