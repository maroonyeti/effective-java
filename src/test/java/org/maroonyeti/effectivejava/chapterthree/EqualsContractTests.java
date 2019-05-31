package org.maroonyeti.effectivejava.chapterthree;

import static org.maroonyeti.effectivejava.chapterthree.COLOR.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EqualsContractTests {

  @Test
  public void equals_ReflexivityProperty_SameInstance_IsEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal).isEqualTo(oStarReal);
  }

  @Test
  public void equals_SymmetryProperty_DiffIntances_SameValues_IsEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal).isEqualTo(oStarReal2);
    assertThat(oStarReal2).isEqualTo(oStarReal);
  }

  @Test
  public void equals_TransitivityProperty_DiffInstances_SameValues_IsEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal3 = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal).isEqualTo(oStarReal2);
    assertThat(oStarReal).isEqualTo(oStarReal3);
    assertThat(oStarReal3).isEqualTo(oStarReal2);

  }

  @Test
  public void equals_ConsistencyProperty_DiffInstances_SameValues_IsEqualEachTime() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);

    for (int i = 1; i <= 100000; i++) {
      assertThat(oStarReal).isEqualTo(oStarReal2);
    }
  }

  @Test
  public void equals_ConsistencyProperty_DiffInstances_DiffValues_IsNotEqualEachTime() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 12, 60, 15);

    for (int i = 1; i <= 100000; i++) {
      assertThat(oStarReal).isNotEqualTo(oStarReal2);
    }
  }

  @Test
  public void equals_NonNullityProperty_DiffInstances_NullValue_NotEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification nullStar = new StarClassification(null, 0, 0, 0);

    assertThat(oStarReal).isNotEqualTo(nullStar);
  }

  @Test
  public void equals_DiffInstances_DiffValues_NotEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarFake = new StarClassification(RED, 30000, 1, 15);

    assertThat(oStarReal).isNotEqualTo(oStarFake);
  }
}
