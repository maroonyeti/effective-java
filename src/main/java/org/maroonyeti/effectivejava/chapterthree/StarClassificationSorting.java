package org.maroonyeti.effectivejava.chapterthree;

import java.util.List;

/**
 * Various sorting methods to practice implementing Comparable.
 *
 */
public interface StarClassificationSorting {

  /**
   * Consumes a list of star classifications and returns a list sorted by avg solar radii.
   *
   * Implement this using both Comparable, and Java 8 Streams.
   * General stream tutorial: https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
   *
   * @param starClassifications the star classification list to sort
   * @return the sorted list.
   */
  List<StarClassification> sortByAvgSolarRadii(List<StarClassification> starClassifications);

  /**
   * Same as above, implemented 2 ways.
   *
   * @param starClassifications
   * @return
   */
  List<StarClassification> sortByApproxSurfaceTemp(List<StarClassification> starClassifications);
}
