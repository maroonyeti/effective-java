package org.maroonyeti.effectivejava;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EqualsTests {
	
	@Test
	public void testEqualsAndHashCode() {
		StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
		StarClassification oStarFake = new StarClassification(RED, 30000, 20, 10)
		
		assertNotEqual(oStarReal, oStarFake)
	}
}
