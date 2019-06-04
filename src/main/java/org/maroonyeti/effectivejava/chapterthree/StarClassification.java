package org.maroonyeti.effectivejava.chapterthree;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class StarClassification implements StarClassificationSorting{

  private COLOR color;

  private int approximateSurfaceTemp;

  private double avgSolarMasses;

  private double avgSolarRadii;

  public StarClassification(COLOR color, int approximateSurfaceTemp, double avgSolarMasses,
		  double avgSolarRadii) {
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

  @Override
  public int hashCode() {
    
    int result = 1;
    
    result = 13 * result + approximateSurfaceTemp;
    result = (int) (13 * result + avgSolarMasses);
    result = (int) (13 * result + avgSolarRadii);
    result = 13 * result + ((color == null) ? 0 : color.hashCode());
    
    return result;
  }
}
