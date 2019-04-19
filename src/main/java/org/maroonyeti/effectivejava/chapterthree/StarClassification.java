package org.maroonyeti.effectivejava.chapterthree;

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
}
