package org.maroonyeti.effectivejava.chapterthree;

import static org.maroonyeti.effectivejava.chapterthree.COLOR.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class HashCodeTests {
  
  @Test
  public void testHashCode_ReflexivityProperty_SameInstances_IsEqual() {
    
    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal.hashCode()).isEqualTo(oStarReal.hashCode());
    
  }
  
  @Test
  public void testHashCode_SymmetryProperty_DiffInstances_SameValues_IsEqual() {
    
    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal.hashCode()).isEqualTo(oStarReal2.hashCode());
  }
  
  @Test
  public void testHashCode_TransitivityProperty_DiffInstances_SameValues_IsEqual() {
    
    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal3 = new StarClassification(BLUE, 30000, 60, 15);

    assertThat(oStarReal.hashCode()).isEqualTo(oStarReal2.hashCode());
    assertThat(oStarReal2.hashCode()).isEqualTo(oStarReal3.hashCode());
  }
  
  @Test
  public void testHashCode_ConsistencyProperty_DiffInstances_SameValues_IsEqualEachTime() {
    
    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 30000, 60, 15);

    for (int i = 1; i <= 100000; i++) {
      assertThat(oStarReal.hashCode()).isEqualTo(oStarReal2.hashCode());
    }
  }
  
  @Test
  public void testHashCode_ConsistencyProperty_DiffInstances_DiffValues_IsNotEqualEachTime() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification oStarReal2 = new StarClassification(BLUE, 12, 60, 15);

    for (int i = 1; i <= 100000; i++) {
      assertThat(oStarReal.hashCode()).isNotEqualTo(oStarReal2.hashCode());
    }
  }
  
  @Test
  public void testHashCode_NonNullityProperty_DiffInstances_NullValue_NotEqual() {

    StarClassification oStarReal = new StarClassification(BLUE, 30000, 60, 15);
    StarClassification nullStar = new StarClassification(null, 0, 0, 0);

    assertThat(oStarReal.hashCode()).isNotEqualTo(nullStar.hashCode());
  }
}