package Mensuration;

class Circle {	
		
		private double radiusCircle;
		private double areaCircle;
		private double circumferenceCircle;
		
		public double getRadiusCircle() {
			return radiusCircle;
		}
		
		public void setRadiusCircle(double radiusCircle) {
			this.radiusCircle = radiusCircle;
		}
		
		public double getAreaCircle() {
			return areaCircle;
		}
		
		public void setAreaCircle(double areaCircle) {
			this.areaCircle = areaCircle;
		}
		
		public double getCircumferenceCircle() {
			return circumferenceCircle;
		}
		
		public void setCircumferenceCircle(double circumferenceCircle) {
			this.circumferenceCircle = circumferenceCircle;
		}
		
		
		public void properties(Circle circle) {
						
				double areaCircle = Mensuration.PI*radiusCircle*radiusCircle ;
				
				double circumferenceCircle = 2*Mensuration.PI*radiusCircle;
				
				circle.setAreaCircle(areaCircle);
				circle.setCircumferenceCircle(circumferenceCircle);
				
			}
			
	}
		
		