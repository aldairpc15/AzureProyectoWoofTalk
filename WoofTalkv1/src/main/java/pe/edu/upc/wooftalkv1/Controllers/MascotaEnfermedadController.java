package pe.edu.upc.wooftalkv1.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wooftalkv1.DTOS.MascotaEnfermedadDTO;
import pe.edu.upc.wooftalkv1.entities.MascotaEnfermedad;
import pe.edu.upc.wooftalkv1.servicesInterfaces.IMascotaEnfermedadServices;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/MascotaEnfermedad")
public class MascotaEnfermedadController {

    @Autowired
    private IMascotaEnfermedadServices iMascotaEnfermedadServices;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR')")
    public List<MascotaEnfermedadDTO> listar() {
        return iMascotaEnfermedadServices.listar().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MascotaEnfermedadDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/agregar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR')")
    public void agregar(@RequestBody MascotaEnfermedadDTO mascotaEnfermedadDTO){
        ModelMapper m = new ModelMapper();
        MascotaEnfermedad mascotaEnfermedad = m.map(mascotaEnfermedadDTO,MascotaEnfermedad.class);
        iMascotaEnfermedadServices.registrar(mascotaEnfermedad);
    }

    @PutMapping("/actualizar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR')")
    public void modificar(@RequestBody MascotaEnfermedadDTO mascotaEnfermedadDTO){
        ModelMapper m = new ModelMapper();
        MascotaEnfermedad  mascotaEnfermedad = m.map(mascotaEnfermedadDTO, MascotaEnfermedad.class);
        iMascotaEnfermedadServices.actualizar(mascotaEnfermedad);
    }

    @GetMapping("/buscarporid/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR')")
    public MascotaEnfermedadDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        MascotaEnfermedadDTO mascotaEnfermedadDTO = m.map(iMascotaEnfermedadServices.listarId(id), MascotaEnfermedadDTO.class);
        return mascotaEnfermedadDTO;
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'DESARROLLADOR')")
    public void eliminar(@PathVariable("id") int id){
        iMascotaEnfermedadServices.eliminar(id);
    }
}
