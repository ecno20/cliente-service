package veterinaria.tienda.vet.clienteservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import veterinaria.tienda.vet.clienteservice.domain.Cliente;
import veterinaria.tienda.vet.clienteservice.domain.Domicilio;

@Data
@NoArgsConstructor
public class RegistroClienteRequest {

	@NotNull
	@Valid
	private Cliente cliente;
	@NotNull
	@Valid
	private Domicilio domicilio;

}
