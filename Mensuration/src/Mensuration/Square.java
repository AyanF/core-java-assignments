package Mensuration;

class Square{
	 
	private double sideSquare;
	private double areaSquare;
	private double perimeterSquare;
	
	
	public double getSideSquare() {
		return sideSquare;
	}
	public void setSideSquare(double sideSquare) {
		this.sideSquare = sideSquare;
	}
	public double getAreaSquare() {
		return areaSquare;
	}
	public void setAreaSquare(double areaSquare) {
		this.areaSquare = areaSquare;
	}
	public double getPerimeterSquare() {
		return perimeterSquare;
	}
	public void setPerimeterSquare(double perimeterSquare) {
		this.perimeterSquare = perimeterSquare;
	}
	
	
	public void properties(Square square) {
		
		
		double area = sideSquare*sideSquare;
		
		double perimeter = 4*sideSquare;
		
		square.setAreaSquare(area);
		square.setPerimeterSquare(perimeter);
	}

}