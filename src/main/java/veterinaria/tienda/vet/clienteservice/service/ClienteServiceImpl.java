package veterinaria.tienda.vet.clienteservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veterinaria.tienda.vet.clienteservice.domain.Cliente;
import veterinaria.tienda.vet.clienteservice.domain.ClienteAlreadyExistsException;
import veterinaria.tienda.vet.clienteservice.domain.Domicilio;
import veterinaria.tienda.vet.clienteservice.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(ClienteServiceImpl.class);

	@Override
	public Cliente registrarCliente(Cliente cliente, Domicilio domicilio) {
		// validacion cliente existente
		Optional<Cliente> clienteExistente = 
				clienteRepository.findByEmail(cliente.getEmail());
		if (clienteExistente.isPresent()) {
			throw new ClienteAlreadyExistsException(cliente.getEmail());
		}
		
		// guardar cliente
		cliente.getDomicilios().add(domicilio);
		clienteRepository.save(cliente);
		LOG.info("Usuario Registrado: " + cliente);
		
		return cliente;
	}

}
