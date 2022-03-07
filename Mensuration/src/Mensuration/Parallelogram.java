package Mensuration;

class Parallelogram {
	
	private double baseParallelogram;
	private double heightParallelogram;

	private double areaParallelogram;
	private double perimeterParallelogram;
	
	
	
	public double getBaseParallelogram() {
		return baseParallelogram;
	}
	public void setBaseParallelogram(double baseParallelogram) {
		this.baseParallelogram = baseParallelogram;
	}
	public double getHeightParallelogram() {
		return heightParallelogram;
	}
	public void setHeightParallelogram(double heightParallelogram) {
		this.heightParallelogram = heightParallelogram;
	}
	public double getAreaParallelogram() {
		return areaParallelogram;
	}
	public void setAreaParallelogram(double areaParallelogram) {
		this.areaParallelogram = areaParallelogram;
	}
	public double getPerimeterParallelogram() {
		return perimeterParallelogram;
	}
	public void setPerimeterParallelogram(double perimeterParallelogram) {
		this.perimeterParallelogram = perimeterParallelogram;
	}
	
	public void properties(Parallelogram parallelogram) {
		
		double area = baseParallelogram*heightParallelogram;
		double perimeter = 2*(baseParallelogram+heightParallelogram);
		
		parallelogram.setAreaParallelogram(area);
		parallelogram.setPerimeterParallelogram(perimeter);
		
	}
}