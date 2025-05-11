package pe.edu.upc.wooftalkv1.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wooftalkv1.DTOS.ObtenerUsuarioDTO;
import pe.edu.upc.wooftalkv1.DTOS.UserDTO;
import pe.edu.upc.wooftalkv1.entities.User;
import pe.edu.upc.wooftalkv1.servicesInterfaces.IUserServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private IUserServices userServices;

    //Listar Usuario
    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR')")
    public List<ObtenerUsuarioDTO> obtenerUsuarios(){
        return userServices.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ObtenerUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Usuario
    @PostMapping("/registrar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR', 'CLIENTE', 'PASEADOR')")
    public void registrar(@RequestBody UserDTO userDTO) {
        ModelMapper m = new ModelMapper();
        User user = m.map(userDTO, User.class);
        userServices.registrar(user);
    }

    //Listar por Id Usuario
    @GetMapping("/buscarporid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR',)")
    public UserDTO listarId(@PathVariable("id") Long id){
        ModelMapper m = new ModelMapper();
        UserDTO userDTO=m.map(userServices.listarId(id),UserDTO.class);
        return userDTO;
    }

    //Actualizar Usuario
    @PutMapping("/actualizar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR', 'CLIENTE', 'PASEADOR')")
    public void actualizar(@RequestBody UserDTO userDTO){
        ModelMapper m=new ModelMapper();
        User user=m.map(userDTO,User.class);
        userServices.actualizar(user);
    }

    //Eliminar Usuario
    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR', 'CLIENTE', 'PASEADOR')")
    public void eliminar(@PathVariable("id") Long id){
        userServices.eliminar(id);
    }
}
