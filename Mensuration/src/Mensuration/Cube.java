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

	public void properties(Cube cube) {
		
		double surfaceAreaCube = 6*(sideCude*sideCude);
		double volumeCube = (sideCude*sideCude*sideCude);
				
		cube.setSurfaceAreaCube(surfaceAreaCube);
		cube.setVolumeCube(volumeCube);
	}
	
}
