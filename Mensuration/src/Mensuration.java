
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mensuration {
	
	Scanner sc = new Scanner(System.in);
	
	static int displayMenu(){
		
		String choiceStr = JOptionPane.showInputDialog(null,"Select a shape \n 1.Circle \n 2.Square \n 3.Rectangle \n 4.Triangle"+ 
                		   "\n 5.Parallelogram \n 5.Semi-Circle \n 6.Rhombus \n 7.Trapezium" +
		           		   "\n 8.Sphere \n 9.Cube \n 10.Cuboid \n 11.Cone \n 12.Cylinder");
		
		int choice = Integer.parseInt(choiceStr);
		
		return choice;
		
	}

	public static void main(String[] args) {
		
		
		displayMenu();
		
		
	}
		
		 
	}


