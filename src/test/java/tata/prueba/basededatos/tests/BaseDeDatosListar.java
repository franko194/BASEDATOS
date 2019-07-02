package tata.prueba.basededatos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.prueba.basededatos.base.BaseDeDatos;
import tata.prueba.basededatos.dato.Dato;

public class BaseDeDatosListar {
	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base =  new BaseDeDatos();
	}

	@Test
	public void cuandoListoNadaEntoncesSize0() {
		int largo = this.base.listar().size();
		assertTrue("Es "+largo + " Deberia ser 0", largo == 0);
	}

	@Test
	public void cuandoListo1EntoncesSize1() {
		this.base.agregar(new Dato("N1","Nuevo Datos 1"));
		int largo = this.base.listar().size();
		assertTrue("Es "+ largo + " Deberia ser 1", largo == 1);
	}
	@Test
	public void cuandoListo5EntoncesSize5() {		
		this.base.agregar(new Dato("N1","Nuevo Datos 1"));
		this.base.agregar(new Dato("N2","Nuevo Datos 2"));
		this.base.agregar(new Dato("N3","Nuevo Datos 3"));
		this.base.agregar(new Dato("N4","Nuevo Datos 4"));
		this.base.agregar(new Dato("N5","Nuevo Datos 5"));
		int largo = this.base.listar().size();
		assertTrue("Es "+ largo + " Deberia ser 5", largo == 5);
	}
	

}
