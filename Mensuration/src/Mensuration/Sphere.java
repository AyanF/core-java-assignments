package Mensuration;

class Sphere{
	
	private double radiusSphere;
	private double heightSphere;

	private double areaSphere;
	private double volumeSphere;
	
	
	
	public double getRadiusSphere() {
		return radiusSphere;
	}
	public void setRadiusSphere(double radiusSphere) {
		this.radiusSphere = radiusSphere;
	}
	
	public double getAreaSphere() {
		return areaSphere;
	}
	public void setAreaSphere(double areaSphere) {
		this.areaSphere = areaSphere;
	}
	public double getVolumeSphere() {
		return volumeSphere;
	}
	public void setVolumeSphere(double volumeSphere) {
		this.volumeSphere = volumeSphere;
	}
	
	public void properties(Sphere sphere) {
		
	 double radius	= sphere.getRadiusSphere();
	 
	 double volume = 4/3*(Mensuration.PI) *(radius*radius*radius);
	 
	 double surfaceArea = 4*Mensuration.PI * (radius*radius);
	 
	 sphere.setAreaSphere(surfaceArea);
	 sphere.setVolumeSphere(volume);
		
	}
	
}
