package ar.edu.unlam.pb2.cazadoresDeRecompensas;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class ZonaTest {

    @Test
    public void crearZonaConProfugos() {
        Profugo profugo1 = new Profugo("Juan", 10, 50, true);
        Set<Profugo> lista = new HashSet<>();
        lista.add(profugo1);
        Zona zona = new Zona("Villa Urquiza", lista);

        assertEquals("Centro", zona.getNombre());
        assertTrue(zona.getProfugos().contains(profugo1));
    }

    /*@Test(expected = ZonaInvalidaException.class)
    public void noPermiteNombreVacio() {
        IProfugo p1 = new Profugo("Ana", 20, 60, false);
        List<IProfugo> lista = new ArrayList<>();
        lista.add(p1);
        new Zona("", lista);
    }

    @Test(expected = ZonaInvalidaException.class)
    public void noPermiteZonaSinProfugos() {
        List<IProfugo> vacia = new ArrayList<>();
        new Zona("Norte", vacia);
    }

    @Test
    public void removerProfugoDeZona() {
        IProfugo p1 = new Profugo("Leo", 5, 45, true);
        IProfugo p2 = new Profugo("Mia", 12, 30, false);
        List<IProfugo> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);

        Zona zona = new Zona("Sur", lista);

        List<IProfugo> aRemover = new ArrayList<>();
        aRemover.add(p1);
        zona.removerProfugos(aRemover);

        Set<IProfugo> restantes = zona.getProfugos();
        assertFalse(restantes.contains(p1));
        assertTrue(restantes.contains(p2));
    }

    @Test
    public void getProfugosDevuelveCopiaDefensiva() {
        IProfugo p1 = new Profugo("Tomás", 15, 40, false);
        List<IProfugo> lista = new ArrayList<>();
        lista.add(p1);
        Zona zona = new Zona("Este", lista);

        Set<IProfugo> copia = zona.getProfugos();
        copia.clear();  // Modificamos la copia

        // La original no debería cambiar
        assertFalse(zona.getProfugos().isEmpty());
    }*/
}
