package ar.edu.unlam.pb2.cazadoresDeRecompensas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfugoTest {

	@Test
	public void queSeCreeUnProfugoQueTengaUnNombre() {
		Profugo profugo1 = new Profugo("Alexis", 1, 80, true);
		String esperado = "Alexis";
		assertEquals(esperado, profugo1.getNombre());
	}
	
	@Test(expected = ProfugoInvalidoException.class)
	public void queSiNoSeEspecificaElNombreDelProfugoEnvieUnaExcepcion() {
	    Profugo profugo1 = new Profugo("", 20, 50, true);
	}
	
	@Test
	public void queSeCreeUnProfugoQueTengaUnNivelDeHabilidadEntreUnoY100() {
		Profugo profugo1 = new Profugo("Alexis", 1, 80, true);
		Integer esperado = 80;
		assertEquals(esperado, profugo1.getlvlHabilidad());
	}
	
	@Test(expected = ProfugoInvalidoException.class)
	public void queSiElNivelDeHabilidadEsMenorAUnoEnvieUnaExcepcion() {
		Profugo profugo1 = new Profugo("Alexis", 1, 0, true);
	}
	
	@Test(expected = ProfugoInvalidoException.class)
	public void queSiElNivelDeHabilidadEsMayorACienEnvieUnaExcepcion() {
		Profugo profugo1 = new Profugo("Alexis", 1, 101, true);
	}
	
	

}
