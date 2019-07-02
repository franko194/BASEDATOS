package tata.prueba.basededatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.prueba.basededatos.base.BaseDeDatos;
import tata.prueba.basededatos.dato.Dato;


public class BaseDeDatosEliminar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base =  new BaseDeDatos();
		this.base.agregar(new Dato("N1","Nuevo Datos 1"));
		this.base.agregar(new Dato("N2","Nuevo Datos 2"));
		this.base.agregar(new Dato("N3","Nuevo Datos 3"));
		this.base.agregar(new Dato("N4","Nuevo Datos 4"));
		this.base.agregar(new Dato("N5","Nuevo Datos 5"));
	}

	@Test
	public void cuandoElimina1Entonces4() {
		this.base.eliminar("N1");
		int largo = this.base.listar().size();
		assertTrue("Es "+largo+"Pero deberia ser 4 ", largo==4);
	}
	@Test
	public void cuandoEliminaN5EntoncesTrue() {
		boolean respuesta = this.base.eliminar("N5");
		assertTrue(respuesta);
	}
	@Test
	public void cuandoNoEliminaEntoncesFalse() {
		boolean respuesta = this.base.eliminar("N6");
		assertFalse(respuesta);
	}

}
