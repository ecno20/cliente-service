package veterinaria.tienda.vet.clienteservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import veterinaria.tienda.vet.clienteservice.domain.Cliente;

public interface ClienteRepository 
extends MongoRepository<Cliente, String>{
	Optional<Cliente> findByEmail(String email);

}
