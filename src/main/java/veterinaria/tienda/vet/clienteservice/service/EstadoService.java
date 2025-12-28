package veterinaria.tienda.vet.clienteservice.service;

import org.springframework.stereotype.Service;

import veterinaria.tienda.vet.clienteservice.domain.Estado;

public interface EstadoService {
	Estado actualizarEstado(String id, Estado estado);

}
