package Mensuration;
 
class Rectangle{

	private double lengthRectangle;
	private double breadthRectangle;

	private double areaRectangle;
	private double perimeterRectangle;
	
	
	public double getLengthRectangle() {
		return lengthRectangle;
	}
	public void setLengthRectangle(double lengthRectangle) {
		this.lengthRectangle = lengthRectangle;
	}
	public double getBreadthRectangle() {
		return breadthRectangle;
	}
	public void setBreadthRectangle(double breadthRectangle) {
		this.breadthRectangle = breadthRectangle;
	}
	public double getAreaRectangle() {
		return areaRectangle;
	}
	public void setAreaRectangle(double areaRectangle) {
		this.areaRectangle = areaRectangle;
	}
	public double getPerimeterRectangle() {
		return perimeterRectangle;
	}
	public void setPerimeterRectangle(double perimeterRectangle) {
		this.perimeterRectangle = perimeterRectangle;
	}
	
	
		public void properties(Rectangle rectangle) {
			
			
			double area = lengthRectangle*breadthRectangle ;
			
			double perimeter = 2*(lengthRectangle+breadthRectangle);
			
			rectangle.setAreaRectangle(area);
			rectangle.setPerimeterRectangle(perimeter);
		}
	
}