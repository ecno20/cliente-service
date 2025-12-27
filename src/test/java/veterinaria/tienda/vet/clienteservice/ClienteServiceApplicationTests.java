package veterinaria.tienda.vet.clienteservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClienteServiceApplicationTests {

    @org.springframework.boot.test.mock.mockito.MockBean
    private veterinaria.tienda.vet.clienteservice.service.EstadoService estadoService;

    @Test
    void contextLoads() { }
}
