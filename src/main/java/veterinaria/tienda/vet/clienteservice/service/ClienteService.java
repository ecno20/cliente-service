package veterinaria.tienda.vet.clienteservice.service;

import veterinaria.tienda.vet.clienteservice.domain.Cliente;
import veterinaria.tienda.vet.clienteservice.domain.Domicilio;

public interface ClienteService {
	
	Cliente registrarCliente(
			Cliente cliente, Domicilio domicilio);

}
