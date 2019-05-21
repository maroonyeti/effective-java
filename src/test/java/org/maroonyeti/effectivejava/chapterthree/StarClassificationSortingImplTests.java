package org.maroonyeti.effectivejava.chapterthree;

import static org.maroonyeti.effectivejava.chapterthree.COLOR.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class StarClassificationSortingImplTests {

  @Test
  public void testComparableSorting_SortAverageSolarRadii_ValuesAscending() {
	
	StarClassification oStar = new StarClassification(BLUE, 30000, 60, 15);
	StarClassification gStar = new StarClassification(YELLOW, 5500, 1, 1);
	StarClassification mStar = new StarClassification(RED, 3000, 0.8, 0.9);
	
	List<StarClassification> stars = new ArrayList<StarClassification>();
	stars.add(oStar);
	stars.add(mStar);
	stars.add(gStar);
	stars.sort(Comparator.comparing(StarClassification::getAvgSolarRadii));
	
	List<StarClassification> starsAscending = new ArrayList<StarClassification>();
	starsAscending.add(mStar);
	starsAscending.add(gStar);
	starsAscending.add(oStar);
	
	assertThat(stars).isEqualTo(starsAscending);
  }
  
  @Test
  public void testStreamSorting_SortAverageSolarRadii_ValuesAscending() {
	
	  
  }
  
}