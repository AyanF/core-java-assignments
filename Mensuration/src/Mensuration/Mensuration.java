package Mensuration;


import javax.swing.JOptionPane;


public class Mensuration {
	

	
	//Declaring final variable pi
	public static final double PI = 3.1415926536;
	
	//Method to display shape menu
	static int displayMenu(){
		
		String choiceStr = JOptionPane.showInputDialog(null,"Select a shape \n 1.Circle \n 2.Square \n 3.Rectangle"
															+ "\n 4.Triangle \n 5.Parallelogram \n 6.Semi-Circle \n"
															+ "7.Rhombus \n 8.Trapezium \n 9.Sphere \n 10.Cube \n"
															+ " 11.Cuboid \n 12.Cone \n 13.Cylinder \n 14.Exit");
		
		int choice = Integer.parseInt(choiceStr);
		
		return choice;
		
	}

	
	

	
	static double findCircumference(Circle circle) {
	
		double radius = circle.getRadiusCircle();
	
		double circumference = 2*PI*radius;
		
		return circumference;
	}
	
	 public static void main(String[] args) {
		
		
		int choice = displayMenu();
		
		switch(choice) {
		
//Circle
		case 1:
			
			String radiusCircleStr = JOptionPane.showInputDialog(null,"Enter radius in cm");
			
			double radiusCircle =  Double.parseDouble(radiusCircleStr);
			
			Circle circle = new Circle();
			circle.setRadiusCircle(radiusCircle); 
			
			circle.properties(circle);
			
			double areaCircle = circle.getAreaCircle();
			double circumferenceCircle = circle.getCircumferenceCircle();
			
			JOptionPane.showMessageDialog(null,"Area is "+ areaCircle+"cm2\nCircumference is "
										  +circumferenceCircle+"cm");
			
			displayMenu();
			
			break;

//Square
		case 2:
			
			String sideSquareStr = JOptionPane.showInputDialog(null,"Enter side");
			
			double sideSquare =  Double.parseDouble(sideSquareStr);
			
			Square square = new Square();
			
			square.setSideSquare(sideSquare);
			square.properties(square);
			
			double squareArea = square.getAreaSquare();
			double squarePerimeter = square.getPerimeterSquare();
			
			JOptionPane.showMessageDialog(null,"Area is "+ squareArea+"cm2\nPerimeteris "+squarePerimeter+"cm");
			
			displayMenu();
			
			break;
			
//Rectangle
		case 3:
			
			String lengthRectangleStr = JOptionPane.showInputDialog(null,"Enter length of rectangle");
			String breadthRectangleStr = JOptionPane.showInputDialog(null,"Enter breadth of rectangle");
			
			double lengthRectangle =  Double.parseDouble(lengthRectangleStr);
			double breadthRectangle =  Double.parseDouble(breadthRectangleStr);
			
			Rectangle rectangle = new Rectangle();
			
			rectangle.setLengthRectangle(lengthRectangle);
			rectangle.setBreadthRectangle(breadthRectangle);
			
			rectangle.properties(rectangle);
			
			double rectangleArea = rectangle.getAreaRectangle();
			double rectanglePerimeter = rectangle.getPerimeterRectangle();
			
			JOptionPane.showMessageDialog(null,"Area is "+ rectangleArea+"cm2\nPerimeteris "
										  +rectanglePerimeter+"cm");
			
			displayMenu();
			
			break;
			
//Triangle
		case 4:
			
			String baseTriangleStr = JOptionPane.showInputDialog(null,"Enter base of Triangle");
			String heightTriangleStr = JOptionPane.showInputDialog(null,"Enter heigh of Trianglet");
			String sideOneTriangleStr = JOptionPane.showInputDialog(null,"Enter side one  of Trianglet");
			String sideTwoTriangleStr = JOptionPane.showInputDialog(null,"Enter side two of Trianglet");
			String sideThreeTriangleStr = JOptionPane.showInputDialog(null,"Enter side three of Trianglet");
			
			double baseTriangle =  Double.parseDouble(baseTriangleStr);
			double heightTriangle =  Double.parseDouble(heightTriangleStr);
			double sideOneTriangle =  Double.parseDouble(sideOneTriangleStr);
			double sideTwoTriangle =  Double.parseDouble(sideTwoTriangleStr);
			double sideThreeTriangle =  Double.parseDouble(sideThreeTriangleStr);
			
			Triangle triangle = new Triangle();
			
			triangle.setBaseTriangle(baseTriangle);
			triangle.setHeighTriangle(heightTriangle);
			triangle.setSideOne(sideOneTriangle);
			triangle.setSideTwo(sideTwoTriangle);
			triangle.setSideThree(sideThreeTriangle);
			
			triangle.properties(triangle);
			
			double triangleArea = triangle.getAreaTriangle();
			double trianglePerimeter = triangle.getPermeterTriangle();
			
			JOptionPane.showMessageDialog(null,"Area is "+ triangleArea+"cm2\nPerimeteris "
										  +trianglePerimeter+"cm");
			
			displayMenu();
			
			
			break;
			
//Parallelogram
		case 5:
			
			String baseParallelogramStr = JOptionPane.showInputDialog(null,"Enter base of Parallelogram");
			String heightParallelogramStr = JOptionPane.showInputDialog(null,"Enter height of Parallelogram");
			
			double baseParallelogram =  Double.parseDouble(baseParallelogramStr);
			double heightParallelogram =  Double.parseDouble(heightParallelogramStr);
			
			Parallelogram parallelogram = new Parallelogram();
			
			parallelogram.setHeightParallelogram(heightParallelogram);
			parallelogram.setBaseParallelogram(baseParallelogram);
			
			
			parallelogram.properties(parallelogram);
			
			double parallelogramArea = parallelogram.getAreaParallelogram();
			double parallelogramPerimeter = parallelogram.getPerimeterParallelogram();
			
			JOptionPane.showMessageDialog(null,"Area is "+ parallelogramArea+"cm2\nPerimeter is "
										  +parallelogramPerimeter+"cm");
			
			displayMenu();
			
			break;
			
//Semi-Circle
		case 6:
			
			String radiusSemiStr = JOptionPane.showInputDialog(null,"Enter radius of semi-circle");
			double radiusSemi =  Double.parseDouble(radiusSemiStr);
			
			SemiCircle semiCircle = new SemiCircle();
			
			semiCircle.setRadiusSemiCircle(radiusSemi);
			
			semiCircle.properties(semiCircle);
			
			double semiCircleArea = semiCircle.getAreaSemiCircle();
			double semiCirclePerimeter = semiCircle.getCircumferenceSemiCircle();
			
			JOptionPane.showMessageDialog(null,"Area is "+ semiCircleArea+"cm2\nCircumference is "
										  +semiCirclePerimeter+"cm");
			
			displayMenu();
			
			break;
			
//Rhombus
		case 7:
			
			String sideRhombusStr = JOptionPane.showInputDialog(null,"Enter side of Rhombus");
			String heightRhombusStr = JOptionPane.showInputDialog(null,"Enter height of Rhombus");
			
			double sideRhombus =  Double.parseDouble(sideRhombusStr);
			double heightRhombus =  Double.parseDouble(heightRhombusStr);
			
			Rhombus rhombus = new Rhombus();
			
			rhombus.setHeightRhombus(heightRhombus);
			rhombus.setSideRhombus(sideRhombus);
			
			rhombus.properties(rhombus);
			
			double rhombusArea = rhombus.getAreaRhombus();
			double rhombusPerimeter = rhombus.getPerimeterRhombus();
			
			JOptionPane.showMessageDialog(null,"Area is "+ rhombusArea+"cm2\nPerimeter is "+rhombusPerimeter+"cm");
			
			displayMenu();
			
			break;
			
//Trapezium
		case 8:
			
			
			
			String baseOneTrapStr = JOptionPane.showInputDialog(null,"Enter base one of Trapezium");
			String baseTwoTrapStr = JOptionPane.showInputDialog(null,"Enter base two of Trapezium");
			String heightTrapStr = JOptionPane.showInputDialog(null,"Enter height of Trapezium");
			
			String sideOneTrapStr = JOptionPane.showInputDialog(null,"Enter side one  of Trapezium");
			String sideTwoTrapStr = JOptionPane.showInputDialog(null,"Enter side two of Trapezium");
			
			double baseOneTrapezium =  Double.parseDouble(baseOneTrapStr);
			double baseTwoTrapezium =  Double.parseDouble(baseTwoTrapStr);
			double heightTrapezium =  Double.parseDouble(heightTrapStr);
			
			double sideOneTrapezium =  Double.parseDouble(sideOneTrapStr);
			double sideTwoTrapezium =  Double.parseDouble(sideTwoTrapStr);
			
			Trapezium trapezium = new Trapezium();
			
			trapezium.setBaseOneTrapezium(baseOneTrapezium);
			trapezium.setBaseTwoTrapezium(baseTwoTrapezium);
			trapezium.setHeightTrapezium(heightTrapezium);
			trapezium.setSideOneTrapezium(sideOneTrapezium);
			trapezium.setSideTwoTrapezium(sideTwoTrapezium);
			
			trapezium.properties(trapezium);
			
			double trapeziumArea = trapezium.getAreaTrapezium();
			double trapeziumPerimeter = trapezium.getPerimeterTrapezium();
			
			JOptionPane.showMessageDialog(null,"Area is "+ trapeziumArea+"cm2\nPerimeter is "
										  +trapeziumPerimeter+"cm");
			
			displayMenu();
			
			break;
			
//Sphere
		case 9:
			
			String radiusSphereStr = JOptionPane.showInputDialog(null,"Enter radius of sphere");
			String heightSphereStr = JOptionPane.showInputDialog(null,"Enter height of sphere");
			
			double radiusSphere  =  Double.parseDouble(radiusSphereStr);
			
			Sphere sphere = new Sphere();
			
			sphere.setRadiusSphere(radiusSphere);
			
			sphere.properties(sphere);
			
			double sphereArea = sphere.getAreaSphere();
			double sphereVolume= sphere.getVolumeSphere();
			
			JOptionPane.showMessageDialog(null,"Surface rea is "+ sphereArea+"cm2\n Volume is "
										  +sphereVolume+"cm3");
			
			displayMenu();
			
			break;
			
//Cube
		case 10:
			
			String sideCubeStr = JOptionPane.showInputDialog(null,"Enter side of cube");
			double sideCube=  Double.parseDouble(sideCubeStr);
			
			Cube cube = new Cube();
			
			cube.setSideCude(sideCube);
			
			cube.properties(cube);
			
			double cubeArea = cube.getSurfaceAreaCube();
			double cubeVolume = cube.getVolumeCube();
			
			JOptionPane.showMessageDialog(null,"Area is "+ cubeArea+"cm2\nVo lumeis "+cubeVolume+"cm3");
			
			displayMenu();
			
			break;
			
//Cuboid
		case 11:
			
			String lengthCuboidStr = JOptionPane.showInputDialog(null,"Enter length of Cuboid");
			String breadthCuboidStr = JOptionPane.showInputDialog(null,"Enter breadth of Cuboid");
			String heightCuboidStr = JOptionPane.showInputDialog(null,"Enter height of Cuboid");
			
			double lengthCuboid =  Double.parseDouble(lengthCuboidStr);
			double breadthCuboid =  Double.parseDouble(breadthCuboidStr);
			double heightCuboid =  Double.parseDouble(heightCuboidStr);
			
			Cuboid cuboid = new Cuboid();
			
			cuboid.setLengthCuboid(lengthCuboid);
			cuboid.setBreadthCuboid(breadthCuboid);
			cuboid.setHeightCuboid(heightCuboid);
			
			cuboid.properties(cuboid);
			
			double cuboidArea = cuboid.getSurfaceAreaCuboid();
			double cuboidVolume = cuboid.getVolumeCuboid();
			
			JOptionPane.showMessageDialog(null,"Area is "+ cuboidArea+"cm2\nVo lumeis "+cuboidVolume+"cm3");
			
			displayMenu();
			
			break;
			
//Cone
		case 12:
			
			String radiusConeStr = JOptionPane.showInputDialog(null,"Enter radius of cone ");
			String heightConeStr = JOptionPane.showInputDialog(null,"Enter height of cone ");
			
			double radiusCone =  Double.parseDouble(radiusConeStr);
			double heightCone =  Double.parseDouble(heightConeStr);
			
			Cone cone = new Cone();
			
			cone.setRadiusCone(radiusCone);
			cone.setHeightCone(heightCone);
			
			cone.properties(cone);
			
			double coneArea = cone.getSurfaceAreaCone();
			double coneVolume = cone.getVolumeCone(); 
			
			JOptionPane.showMessageDialog(null,"Area is "+ coneArea+"cm2\nVo lumeis "+coneVolume+"cm");
			
			displayMenu();
			
			break;
			
//Cylinder
		case 13:
			
			String radiusCylinderStr = JOptionPane.showInputDialog(null,"Enter radius of Cylinder");
			String heightCylinderStr = JOptionPane.showInputDialog(null,"Enter height of Cylinder");
			
			double radiusCylinder =  Double.parseDouble(radiusCylinderStr);
			double heightCylinder =  Double.parseDouble(heightCylinderStr);
			
			Cylinder cylinder = new Cylinder();
			
			cylinder.setHeightCylinder(heightCylinder);
			cylinder.setRadiusCylinder(radiusCylinder);
			
			cylinder.properties(cylinder);
			
			double cylinderArea = cylinder.getSurfaceAreaCylinder();
			double cylinderVolume = cylinder.getVolumeCylinder();
			
			JOptionPane.showMessageDialog(null,"Area is "+ cylinderArea+"cm2\nVo lumeis "+cylinderVolume+"cm3");
			
			displayMenu();
			
			break;
			
		case 14:
			break;
		}
		
			
		
		
	}


}


