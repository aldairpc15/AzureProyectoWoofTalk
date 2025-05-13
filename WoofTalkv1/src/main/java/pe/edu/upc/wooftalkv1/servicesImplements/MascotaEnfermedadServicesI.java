package pe.edu.upc.wooftalkv1.servicesImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wooftalkv1.entities.MascotaEnfermedad;
import pe.edu.upc.wooftalkv1.repositories.MascotaEnfermedadRepository;
import pe.edu.upc.wooftalkv1.servicesInterfaces.IMascotaEnfermedadServices;

import java.util.List;
@Service
public class MascotaEnfermedadServicesI implements IMascotaEnfermedadServices {

    @Autowired
    private MascotaEnfermedadRepository mascotaEnfermedadRepository;

    //Listar MascotaEnfermedad
    @Override
    public List<MascotaEnfermedad> listar() {return mascotaEnfermedadRepository.findAll();}

    //Registrar MascotaEnfermedad
    @Override
    public void registrar(MascotaEnfermedad mascotaEnfermedad) {
        mascotaEnfermedadRepository.save(mascotaEnfermedad);
    }

    //Listar por Id MascotaEnfermedad
    @Override
    public MascotaEnfermedad listarId(int id) {
        return mascotaEnfermedadRepository.findById(id).orElse(new MascotaEnfermedad());
    }

    //Actualizar MascotaEnfermedad
    @Override
    public void actualizar(MascotaEnfermedad mascotaEnfermedad) {mascotaEnfermedadRepository.save(mascotaEnfermedad); }

    //Eliminar MascotaEnfermedad
    @Override
    public void eliminar(int id) {
        mascotaEnfermedadRepository.deleteById(id);
    }
}
