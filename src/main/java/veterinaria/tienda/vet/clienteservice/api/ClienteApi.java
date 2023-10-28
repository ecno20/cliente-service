package veterinaria.tienda.vet.clienteservice.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import veterinaria.tienda.vet.clienteservice.domain.Cliente;
import veterinaria.tienda.vet.clienteservice.dto.RegistroClienteRequest;

@RequestMapping(path="api/clientes", produces="application/json")
@CrossOrigin(origins="*")
@Tag(name="cliente", description="API del Recurso del cliente")
public interface ClienteApi {
	@Operation(summary = "Registrar Cliente")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "201", 
		description = "Cliente Creado Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Cliente.class)) }),
	  @ApiResponse(responseCode = "409", 
	  	description="Ya existe un cliente con el mail especificado", 
	    content = @Content) })
	@PostMapping(path="registro", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	Cliente registrarCliente(
		@NotNull @Valid @RequestBody RegistroClienteRequest request);


}
