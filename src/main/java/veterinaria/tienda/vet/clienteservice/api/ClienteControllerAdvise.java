package veterinaria.tienda.vet.clienteservice.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import veterinaria.tienda.vet.clienteservice.domain.ClienteAlreadyExistsException;

@RestControllerAdvice
public class ClienteControllerAdvise {
	@ExceptionHandler(ClienteAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	private String clienteAlreadyExistsHandler(
			ClienteAlreadyExistsException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	private String validatorHandler(
			MethodArgumentNotValidException exception) {
		return "Existen errores de validacion en el payload";
	}

}
