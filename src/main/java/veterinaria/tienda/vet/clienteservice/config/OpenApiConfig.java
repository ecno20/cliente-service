package veterinaria.tienda.vet.clienteservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "DogTor Cliente Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "Cliente Service para el sistema Veterinaria", 
			contact = @Contact(
				name = "UNAM", 
				url = "https://www.unam.mx/", 
			email = "jdsmatemaster@gmail.com")))
public class OpenApiConfig {

}
