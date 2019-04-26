package org.maroonyeti.effectivejava.chapterthree;

import static org.maroonyeti.effectivejava.chapterthree.COLOR.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EqualsContractTests {

  @Test // reflexive property of equals contract
  public void equals_SameInstance_IsEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal).isEqualTo(oStarReal);
  }

  @Test // symmetric and transitive properties of equals contract
  public void equals_DiffIntances_SameValues_IsEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal3 = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal).isEqualTo(oStarReal2);
    assertThat(oStarReal2).isEqualTo(oStarReal);
    assertThat(oStarReal2).isEqualTo(oStarReal3);
    assertThat(oStarReal3).isEqualTo(oStarReal);
  }

  @Test // null reference value does not equal non-null reference value
  public void equals_DiffInstances_NullValue_NotEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification nullStar = new StarClassification(null, 0 ,0, 0);
    
    assertThat(oStarReal).isNotEqualTo(nullStar);
  }
  
  @Test
  public void equals_DiffInstances_DiffValues_NotEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarFake = new StarClassification(RED, 30000, 1, 15);

    assertThat(oStarReal).isNotEqualTo(oStarFake);
  }
}
