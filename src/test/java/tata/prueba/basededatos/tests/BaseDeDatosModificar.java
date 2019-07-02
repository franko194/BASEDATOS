package tata.prueba.basededatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.prueba.basededatos.base.BaseDeDatos;
import tata.prueba.basededatos.dato.Dato;

public class BaseDeDatosModificar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base =  new BaseDeDatos();
		this.base.agregar(new Dato("N1","Nuevo Dato 1"));
		this.base.agregar(new Dato("N2","Nuevo Dato 2"));
		this.base.agregar(new Dato("N3","Nuevo Dato 3"));
		this.base.agregar(new Dato("N4","Nuevo Dato 4"));
		this.base.agregar(new Dato("N5","Nuevo Dato 5"));
	}

	@Test
	public void cuendoModificaEntoncesTrue() {
		boolean resultado = this.base.modificar(new Dato("N1","Cualquier otro Nuevo Dato"));
		assertTrue("EL "+ resultado +" Deberia ser True",resultado);
	}
	@Test
	public void cuendoNoModificaEntoncesfalse() {
		boolean resultado = this.base.modificar(new Dato("N6", "Cualquier otro Nuevo Dato incorrecto"));
		assertFalse("EL "+ resultado +" Deberia ser False",resultado);
	}

}
