package Mensuration;

class Cone{
	
	private double radiusCone;
	private double heightCone;
	private double surfaceAreaCone;
	private double volumeCone;
	
	
	
	public double getRadiusCone() {
		return radiusCone;
	}
	public void setRadiusCone(double radiusCone) {
		this.radiusCone = radiusCone;
	}
	public double getHeightCone() {
		return heightCone;
	}
	public void setHeightCone(double heightCone) {
		this.heightCone = heightCone;
	}
	public double getSurfaceAreaCone() {
		return surfaceAreaCone;
	}
	public void setSurfaceAreaCone(double surfaceAreaCone) {
		this.surfaceAreaCone = surfaceAreaCone;
	}
	public double getVolumeCone() {
		return volumeCone;
	}
	public void setVolumeCone(double volumeCone) {
		this.volumeCone = volumeCone;
	}
	
	public void properties(Cone cone){
	
		surfaceAreaCone = Mensuration.PI *(radiusCone *radiusCone);  
		volumeCone = Mensuration.PI * (radiusCone *radiusCone)*(heightCone/3);  
	
		cone.setVolumeCone(volumeCone);
		cone.setSurfaceAreaCone(surfaceAreaCone);
	
	
	}
	
}
