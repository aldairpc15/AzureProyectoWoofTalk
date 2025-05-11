package pe.edu.upc.wooftalkv1.servicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.upc.wooftalkv1.entities.User;
import pe.edu.upc.wooftalkv1.repositories.IUserRepository;
import pe.edu.upc.wooftalkv1.servicesInterfaces.IUserServices;

import java.util.List;

@Service
public class UserServicesImplements implements IUserServices {

    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    //Listar Usuario
    @Override
    public List<User> listar() {return userRepository.findAll();}

    //Registrar Usuario
    @Override
    public void registrar(User user){
        String encriptacion = passwordEncoder.encode(user.getPassword());
        user.setPassword(encriptacion);
        userRepository.save(user);
    }

    //Listar por Id Usuario
    @Override
    public User listarId(Long id) {
        return userRepository.findById(id).orElse(new User());
    }

    //Actualizar Usuario
    @Override
    public void actualizar(User user) {userRepository.save(user); }

    //Eliminar Usuario
    @Override
    public void eliminar(Long id) {
        userRepository.deleteById(id);
    }
}
