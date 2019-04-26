package org.maroonyeti.effectivejava.chapterthree;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class StarClassification {

  private COLOR color;

  private int approximateSurfaceTemp;

  private int avgSolarMasses;

  private int avgSolarRadii;

  public StarClassification(COLOR color, int approximateSurfaceTemp, int avgSolarMasses,
      int avgSolarRadii) {
    this.color = color;
    this.approximateSurfaceTemp = approximateSurfaceTemp;
    this.avgSolarMasses = avgSolarMasses;
    this.avgSolarRadii = avgSolarRadii;
  }

  @Override
  public boolean equals(Object obj) {
    boolean result = false;
    if (obj instanceof StarClassification) {
      StarClassification that = (StarClassification) obj;
      result = (this.getColor() == that.getColor()
          && this.getApproximateSurfaceTemp() == that.getApproximateSurfaceTemp()
          && this.getAvgSolarMasses() == that.getAvgSolarMasses()
          && this.getAvgSolarRadii() == that.getAvgSolarRadii());
    }
    return result;
  }
}
