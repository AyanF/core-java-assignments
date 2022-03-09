package Mensuration;

class Rhombus {
	
	private double sideRhombus;
	private double heightRhombus;

	private double areaRhombus;
	private double perimeterRhombus;
	
	
	
	public double getSideRhombus() {
		return sideRhombus;
	}
	
	public void setSideRhombus(double sideRhombus) {
		this.sideRhombus = sideRhombus;
	}
	
	public double getHeightRhombus() {
		return heightRhombus;
	}
	public void setHeightRhombus(double heightRhombus) {
		this.heightRhombus = heightRhombus;
	}
	
	public double getAreaRhombus() {
		return areaRhombus;
	}
	
	public void setAreaRhombus(double areaRhombus) {
		this.areaRhombus = areaRhombus;
	}
	
	public double getPerimeterRhombus() {
		return perimeterRhombus;
	}
	
	public void setPerimeterRhombus(double perimeterRhombus) {
		this.perimeterRhombus = perimeterRhombus;
	}
	
	public void properties(Rhombus rhombus) {
		
		areaRhombus = sideRhombus*heightRhombus ;
		perimeterRhombus = 4*sideRhombus ;
		
		rhombus.setPerimeterRhombus(perimeterRhombus);
		rhombus.setAreaRhombus(areaRhombus);
		
	}
	
}
