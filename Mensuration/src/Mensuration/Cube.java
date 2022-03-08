package Mensuration;

class Cube {
	
	private double sideCude;

	private double surfaceAreaCube;
	private double volumeCube;
	
	
	public double getSideCude() {
		return sideCude;
	}
	
	public void setSideCude(double sideCude) {
		this.sideCude = sideCude;
	}
	
	public double getSurfaceAreaCube() {
		return surfaceAreaCube;
	}
	
	public void setSurfaceAreaCube(double surfaceAreaCube) {
		this.surfaceAreaCube = surfaceAreaCube;
	}
	
	public double getVolumeCube() {
		return volumeCube;
	}
	
	public void setVolumeCube(double volumeCube) {
		this.volumeCube = volumeCube;
	}

	@Override
	public double findArea(Square square) {
		
		double side = square.getSideSquare();
		
		double area = side*side;
		
		return area;
	}

	@Override
	public double findPerimeter(Square square) {
		
		double side = square.getSideSquare();
		
		double perimeter = 4*side;
				
		return perimeter;
	}
	
}