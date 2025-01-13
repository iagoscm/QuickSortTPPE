package tst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import app.Particionador;

public class ParticionamentoTest { 

	Particionador q; 
	
	public void testeParticionamento1() {
        int[] valores = new int[] {5, 3, 9, 2, 7, 6, 4, 3, 0, 1, -1, 8};
        q = Particionador.getParticiona(0, valores.length - 1,valores);
        q.analisa();
        assertEquals(7, q.trocaPivo());
    }
	
	@Test
	public void testParticionamento2() {
		int[] valores = new int[] {2, 3, 4, -6, 0, -10, -8, 5, 6, 7};
		q = Particionador.getParticiona(0, valores.length - 1,valores);
        q.analisa();
        assertEquals(4, q.trocaPivo());
	}
	
	@Test
	public void testParticionamento3() {
		int[] valores = new int[] {6, -2, 1, -5, 0, 7, -8, 4, 10, 1, 8, 4, 0, -5, -2, -1, -6, -1, -1, -2};
		q = Particionador.getParticiona(0, valores.length - 1,valores);
        q.analisa();
		assertNotNull(q);
        assertEquals(16, q.trocaPivo());
	}
}