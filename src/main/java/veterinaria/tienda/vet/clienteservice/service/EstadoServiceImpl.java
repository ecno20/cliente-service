package veterinaria.tienda.vet.clienteservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import veterinaria.tienda.vet.clienteservice.domain.Estado;
import veterinaria.tienda.vet.clienteservice.repository.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService {

    private final EstadoRepository estadoRepository;

    public EstadoServiceImpl(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public Estado actualizarEstado(String id, Estado estado) {
        return estadoRepository.findById(id)
            .map(e -> {
                e.setNombre(estado.getNombre());
                return estadoRepository.save(e);
            })
            .orElse(null); // o lanzar excepción si lo prefieres
    }
}
