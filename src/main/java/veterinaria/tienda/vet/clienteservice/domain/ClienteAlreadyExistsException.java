package veterinaria.tienda.vet.clienteservice.domain;

public class ClienteAlreadyExistsException extends RuntimeException{
	public ClienteAlreadyExistsException(String email) {
		super("Ya existe un cliente registrado con email: " + email);
	}

}
