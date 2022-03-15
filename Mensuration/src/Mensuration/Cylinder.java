package Mensuration;

class Cylinder{
	
	
	private double radiusCylinder;
	private double heightCylinder;

	private double surfaceAreaCylinder;
	private double volumeCylinder;
	
	
	
	public double getRadiusCylinder() {
		return radiusCylinder;
	}
	
	public void setRadiusCylinder(double radiusCylinder) {
		this.radiusCylinder = radiusCylinder;
	}
	
	public double getHeightCylinder() {
		return heightCylinder;
	}
	
	public void setHeightCylinder(double heightCylinder) {
		this.heightCylinder = heightCylinder;
	}
	
	public double getSurfaceAreaCylinder() {
		return surfaceAreaCylinder;
	}
	
	public void setSurfaceAreaCylinder(double surfaceAreaCylinder) {
		this.surfaceAreaCylinder = surfaceAreaCylinder;
	}
	
	public double getVolumeCylinder() {
		return volumeCylinder;
	}
	
	public void setVolumeCylinder(double volumeCylinder) {
		this.volumeCylinder = volumeCylinder;
	}
	
	public void properties(Cylinder cylinder){
		
		surfaceAreaCylinder = 2*Mensuration.PI* radiusCylinder*heightCylinder 
							  +2*Mensuration.PI*(radiusCylinder*radiusCylinder);
		
		volumeCylinder = Mensuration.PI* (radiusCylinder*radiusCylinder)*heightCylinder;
		
		cylinder.setSurfaceAreaCylinder(surfaceAreaCylinder);
		cylinder.setVolumeCylinder(volumeCylinder);
		
	}
	
	
	
}
