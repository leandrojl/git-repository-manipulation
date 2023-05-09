package ar.edu.unlam.pb1.test.callcenter;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb1.finalAgosto.Contacto;

public class TestCallcenter {
	
	@Test
	public void queSePuedaCrearUnContacto() {
		Contacto contacto = new Contacto();
		
		Assert.assertNotNull(contacto);
	}

}
