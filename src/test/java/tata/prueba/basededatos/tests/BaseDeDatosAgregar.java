package tata.prueba.basededatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.prueba.basededatos.base.BaseDeDatos;
import tata.prueba.basededatos.dato.Dato;

public class BaseDeDatosAgregar {

	private BaseDeDatos base;

	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoInsertaEntoncesRetornaTrue() {
		boolean retorno = this.base.agregar(new Dato("N1", "Nuevo datos"));
		assertTrue("EL " + retorno + " Deberia ser True", retorno );
	}
	@Test
	public void cuandoNoInsertaEntoncesRetornaFalse() {
		boolean retorno = this.base.agregar(new Dato("N", "Nuevo datos"));
		assertFalse("EL " + retorno + " Deberia ser false", retorno);
	}

}
