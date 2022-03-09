package Mensuration;

class SemiCircle {
	
	private double radiusSemiCircle;
	private double areaSemiCircle;

	private double circumferenceSemiCircle;

	public double getRadiusSemiCircle() {
		return radiusSemiCircle;
	}

	public void setRadiusSemiCircle(double radiusSemiCircle) {
		this.radiusSemiCircle = radiusSemiCircle;
	}

	public double getAreaSemiCircle() {
		return areaSemiCircle;
	}

	public void setAreaSemiCircle(double areaSemiCircle) {
		this.areaSemiCircle = areaSemiCircle;
	}

	public double getCircumferenceSemiCircle() {
		return circumferenceSemiCircle;
	}

	public void setCircumferenceSemiCircle(double circumferenceSemiCircle) {
		this.circumferenceSemiCircle = circumferenceSemiCircle;
	}

	public void properties(SemiCircle semiCircle) {
		
		
		double area = 1/2*Mensuration.PI*(radiusSemiCircle*radiusSemiCircle);
		
		double perimeter = (Mensuration.PI*radiusSemiCircle) + (2*radiusSemiCircle) ;
		
		semiCircle.setAreaSemiCircle(area);
		semiCircle.setCircumferenceSemiCircle(perimeter);
	}
	
}
