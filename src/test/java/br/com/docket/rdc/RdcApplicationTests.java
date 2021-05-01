package br.com.docket.rdc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.docket.rdc.controller.RcdController;

@RunWith(MockitoJUnitRunner.class)
public class RdcApplicationTests {

	@Test
	public void contextLoads() {

		RcdController controlador = new RcdController();

		assertNotNull(controlador);
		// controlador.Hello(modelo);
		// assertEquals(expected, actual);

	}

}
