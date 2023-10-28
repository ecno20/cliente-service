package veterinaria.tienda.vet.clienteservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import veterinaria.tienda.vet.clienteservice.domain.Cliente;
import veterinaria.tienda.vet.clienteservice.dto.RegistroClienteRequest;
import veterinaria.tienda.vet.clienteservice.service.ClienteService;

@RestController
public class ClienteController implements ClienteApi{
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public Cliente registrarCliente(
			RegistroClienteRequest request) {
		return clienteService.registrarCliente(
			request.getCliente(), request.getDomicilio());
	}

}
