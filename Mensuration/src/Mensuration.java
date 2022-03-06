
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mensuration {
	
	Scanner sc = new Scanner(System.in);
	
	//Declaring final variable pi
	static final double PI = 3.1415926536;
	
	//Method to display shape menu
	static int displayMenu(){
		
		String choiceStr = JOptionPane.showInputDialog(null,"Select a shape \n 1.Circle \n 2.Square \n 3.Rectangle"
															+ "\n 4.Triangle \n 5.Parallelogram \n 6.Semi-Circle \n"
															+ "7.Rhombus \n 8.Trapezium \n 9.Sphere \n 10.Cube \n"
															+ " 11.Cuboid \n 12.Cone \n 13.Cylinder \n 14.Exit");
		
		int choice = Integer.parseInt(choiceStr);
		
		return choice;
		
	}
	
	
	
	


	public static void main(String[] args) {
		
		
		int choice = displayMenu();
		
		switch(choice) {
		
//Circle
		case 1:
			
			String radiusCircleStr = JOptionPane.showInputDialog(null,"Enter radius");
			
			double radiusCircle =  Double.parseDouble(radiusStr);
			
			break;

//Square
		case 2:
			
			String sideSquareStr = JOptionPane.showInputDialog(null,"Enter side");
			
			double sideSquare =  Double.parseDouble(sideSquareStr);
			
			break;
			
//Rectangle
		case 3:
			
			String lengthRectangleStr = JOptionPane.showInputDialog(null,"Enter length of rectangle");
			String breadthRectangleStr = JOptionPane.showInputDialog(null,"Enter breadth of rectangle");
			
			double lengthRectangle =  Double.parseDouble(lengthRectangleStr);
			double breadthRectangle =  Double.parseDouble(breadthRectangleStr);
			
			break;
			
//Triangle
		case 4:
			
			String baseTriangleStr = JOptionPane.showInputDialog(null,"Enter base of Triangle");
			String heightTriangleStr = JOptionPane.showInputDialog(null,"Enter heigh of Trianglet");
			
			double baseTriangle =  Double.parseDouble(baseTriangleStr);
			double heightTriangle =  Double.parseDouble(heightTriangleStr);
			
			break;
			
//Parallelogram
		case 5:
			
			String baseParallelogramStr = JOptionPane.showInputDialog(null,"Enter base of Parallelogram");
			String heightParallelogramStr = JOptionPane.showInputDialog(null,"Enter height of Parallelogram");
			
			double baseParallelogram =  Double.parseDouble(baseParallelogramStr);
			double heightParallelogram =  Double.parseDouble(heightParallelogramStr);
			break;
			
//Semi Circle
		case 6:
			
			String radiusSemiStr = JOptionPane.showInputDialog(null,"Enter radius of semi-circle");
			double radiusSemi =  Double.parseDouble(radiusSemiStr);
			
			break;
			
//Rhombus
		case 7:
			
			String sideRhombusStr = JOptionPane.showInputDialog(null,"Enter side of Rhombus");
			String heightRhombusStr = JOptionPane.showInputDialog(null,"Enter height of Rhombus");
			
			double sideRhombus =  Double.parseDouble(sideRhombusStr);
			double heightRhombus =  Double.parseDouble(heightRhombusStr);
			
			break;
			
//Trapezium
		case 8:
			
			
			
			String baseOneTrapStr = JOptionPane.showInputDialog(null,"Enter base one of Trapezium");
			String baseTwoTrapStr = JOptionPane.showInputDialog(null,"Enter base two of Trapezium");
			String heightTrapStr = JOptionPane.showInputDialog(null,"Enter height of Trapezium");
			
			String sideOneTrapStr = JOptionPane.showInputDialog(null,"Enter side one  of Trapezium");
			String sideTwoTrapStr = JOptionPane.showInputDialog(null,"Enter side two of Trapezium");
			
			double baseOneTrap =  Double.parseDouble(baseOneTrapStr);
			double baseTwoTrap =  Double.parseDouble(baseTwoTrapStr);
			double heightTrap =  Double.parseDouble(heightTrapStr);
			
			double sideOneTrap =  Double.parseDouble(sideOneTrapStr);
			double sodeTwoTrap =  Double.parseDouble(sideTwoTrapStr);
			
			break;
			
//Sphere
		case 9:
			
			String radiusSphereStr = JOptionPane.showInputDialog(null,"Enter radius of sphere");
			String heightSphereStr = JOptionPane.showInputDialog(null,"Enter height of sphere");
			
			double radius =  Double.parseDouble(radiusSphereStr);
			
			break;
			
//Cube
		case 10:
			
			String sideCubeStr = JOptionPane.showInputDialog(null,"Enter side of cube");
			double sideCube=  Double.parseDouble(sideCubeStr);
			
			break;
			
//Cuboid
		case 11:
			
			String lengthCuboidStr = JOptionPane.showInputDialog(null,"Enter length of Cuboid");
			String breadthCuboidStr = JOptionPane.showInputDialog(null,"Enter breadth of Cuboid");
			
			double lengthCuboid =  Double.parseDouble(lengthCuboidStr);
			double breadthCuboid =  Double.parseDouble(breadthCuboidStr);
			
			break;
			
//Cone
		case 12:
			
			String radiusConeStr = JOptionPane.showInputDialog(null,"Enter radius of cone ");
			String heightConeStr = JOptionPane.showInputDialog(null,"Enter height of cone ");
			
			double radiusCone =  Double.parseDouble(radiusConeStr);
			double heightCone =  Double.parseDouble(heightConeStr);
			
			break;
			
//Cylinder
		case 13:
			
			String radiusCylinderStr = JOptionPane.showInputDialog(null,"Enter radius of Cylinder");
			String heightCylinderStr = JOptionPane.showInputDialog(null,"Enter height of Cylinder");
			
			double radiusCylinder =  Double.parseDouble(radiusCylinderStr);
			double heightCylinder =  Double.parseDouble(heightCylinderStr);
			
			break;
			
		case 14:
			break;
		}
		
			
		
		
	}
		
		 
	}


