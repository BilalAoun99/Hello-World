package HelloW;

import java.util.Scanner;

public class PaintEstimator {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	       double height=input.nextDouble();
	       double width=input.nextDouble();
	       System.out.println("Enter wall height (feet):");
	       System.out.println("Enter wall width (feet):");
	      
	       
	      
	       
	       double area=(height*width);
	       System.out.println("Wall area: "+area+" square feet");
	      
	       double paint_needed=area/350;
	       System.out.println("Paint needed: "+paint_needed+" gallons");
	      
	       int cans_needed=(int)(Math.round(paint_needed));
	       System.out.println("Cans needed: "+cans_needed+" can(s)");
	      
	     
	      
	   }
	}

