package org.maroonyeti.effectivejava.chapterthree;

import static org.maroonyeti.effectivejava.chapterthree.COLOR.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EqualsTests {

	@Test
	public void equals_SameInstance_IsEqual() {

		StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
		assertThat(oStarReal).isEqualTo(oStarReal);
	}

	@Test
	public void equals_DiffIntances_SameValues_IsEqual() {
		StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
		StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);

		// same value...should be equal
		assertThat(oStarReal).isEqualTo(oStarReal2);
	}

	// TODO
	// equals_DiffInstances_DiffValues_NotEqual
	// TODO test all equals contract
}
