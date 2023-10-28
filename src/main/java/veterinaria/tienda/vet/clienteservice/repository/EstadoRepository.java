package veterinaria.tienda.vet.clienteservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import veterinaria.tienda.vet.clienteservice.domain.Estado;

public interface EstadoRepository 
	extends MongoRepository<Estado, String>{

}
