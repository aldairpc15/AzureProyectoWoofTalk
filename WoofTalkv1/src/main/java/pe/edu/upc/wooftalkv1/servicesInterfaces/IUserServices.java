package pe.edu.upc.wooftalkv1.servicesInterfaces;

import pe.edu.upc.wooftalkv1.entities.User;

import java.util.List;

public interface IUserServices {

    //Listar Usuario
    public List<User> listar();

    //Registrar Usuario
    public void registrar(User user);

    //Listar por Id Usuario
    public User listarId(Long id);

    //Actualizar Usuario
    public void actualizar(User user);

    //Eliminar Usuario
    void eliminar(Long id);
}
