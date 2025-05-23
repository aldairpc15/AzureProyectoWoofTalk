package pe.edu.upc.wooftalkv1.servicesInterfaces;

import pe.edu.upc.wooftalkv1.entities.Rol;

import java.util.List;

public interface IRolServices {
    public List<Rol> list();
    public void insert(Rol rol);
    public void update(Rol r);
    public Rol listarId(Long id);
    public void delete(Long id);
    public List<String[]> cantidadTotalDeRolUsuariosRegistrados();

}
