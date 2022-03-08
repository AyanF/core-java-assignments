package Mensuration;

class Cuboid{
	
	private double lengthCuboid;
	private double breadthCuboid;
	private double heightCuboid;

	private double volumeCuboid;
	private double surfaceAreaCuboid;
	
	
	
	public double getLengthCuboid() {
		return lengthCuboid;
	}
	public void setLengthCuboid(double lengthCuboid) {
		this.lengthCuboid = lengthCuboid;
	}
	public double getBreadthCuboid() {
		return breadthCuboid;
	}
	public void setBreadthCuboid(double breadthCuboid) {
		this.breadthCuboid = breadthCuboid;
	}
	public double getHeightCuboid() {
		return heightCuboid;
	}
	public void setHeightCuboid(double heightCuboid) {
		this.heightCuboid = heightCuboid;
	}
	public double getVolumeCuboid() {
		return volumeCuboid;
	}
	public void setVolumeCuboid(double volumeCuboid) {
		this.volumeCuboid = volumeCuboid;
	}
	public double getSurfaceAreaCuboid() {
		return surfaceAreaCuboid;
	}
	public void setSurfaceAreaCuboid(double surfaceAreaCuboid) {
		this.surfaceAreaCuboid = surfaceAreaCuboid;
	}
	
	public void properties(Cuboid cuboid){
		
		surfaceAreaCuboid = 2*lengthCuboid*breadthCuboid +2*lengthCuboid*heightCuboid +2*heightCuboid*breadthCuboid;  
		volumeCuboid  = lengthCuboid*breadthCuboid*heightCuboid;
		
		cuboid.setSurfaceAreaCuboid(surfaceAreaCuboid);
		cuboid.setVolumeCuboid(volumeCuboid);
		
		}
	

}
