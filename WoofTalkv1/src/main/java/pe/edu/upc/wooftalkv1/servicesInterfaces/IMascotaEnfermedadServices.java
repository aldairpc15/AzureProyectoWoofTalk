package pe.edu.upc.wooftalkv1.servicesInterfaces;

import pe.edu.upc.wooftalkv1.entities.MascotaEnfermedad;
import pe.edu.upc.wooftalkv1.entities.Mascotas;

import java.util.List;

public interface IMascotaEnfermedadServices {

    public List<MascotaEnfermedad> listar();

    //Registrar MascotaEnfermedad
    public void registrar(MascotaEnfermedad mascotaEnfermedad);

    //Listar por Id MascotaEnfermedad
    public MascotaEnfermedad listarId(int id);

    //Actualizar MascotaEnfermedad
    public void actualizar(MascotaEnfermedad mascotaEnfermedad);

    //Eliminar MascotaEnfermedad
    void eliminar(int id);
}