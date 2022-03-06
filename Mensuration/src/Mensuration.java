
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mensuration {
	
	Scanner sc = new Scanner(System.in);
	
	//Declaring final variable pi
	static final double PI = 3.1415926536;
	
	//Method to display shape menu
	static int displayMenu(){
		
		String choiceStr = JOptionPane.showInputDialog(null,"Select a shape \n 1.Circle \n 2.Square \n 3.Rectangle \n 4.Triangle"+ 
                		   "\n 5.Parallelogram \n 5.Semi-Circle \n 6.Rhombus \n 7.Trapezium" +
		           		   "\n 8.Sphere \n 9.Cube \n 10.Cuboid \n 11.Cone \n 12.Cylinder \n 13.Exit");
		
		int choice = Integer.parseInt(choiceStr);
		
		return choice;
		
	}
	
	
	
	


	public static void main(String[] args) {
		
		
		int choice = displayMenu();
		
		switch(choice) {
		
		case 1:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");
			
			double radius =  Double.parseDouble(radiusStr);
			
			break;
			
		case 2:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 3:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 4:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 5:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 6:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 7:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 8:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 9:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 10:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 11:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 12:
			
			String radiusStr = JOptionPane.showInputDialog(null,"Enter radius");

			break;
			

		case 13:
			break;
			
			
		}
		
			
		
		
	}
		
		 
	}


