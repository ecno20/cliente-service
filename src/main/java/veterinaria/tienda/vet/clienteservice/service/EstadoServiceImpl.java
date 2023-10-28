package veterinaria.tienda.vet.clienteservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import veterinaria.tienda.vet.clienteservice.domain.Estado;
import veterinaria.tienda.vet.clienteservice.repository.EstadoRepository;

public class EstadoServiceImpl implements EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public Estado actualizarEstado(String id, Estado estado) {
		Optional<Estado> estadoExistente = estadoRepository.findById(id);
		if (estadoExistente.isPresent()) {
			Estado estadoActualizar = estadoExistente.get();
			estadoActualizar.setNombre(estado.getNombre());
			estadoRepository.save(estadoActualizar);
			return estadoActualizar;
		}
		return null;

}
}
