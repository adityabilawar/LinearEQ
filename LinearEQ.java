import java.awt.Point;

public class LinearEQ {

	public double xcoeff, ycoeff, constant;

	// default constructor (write signature line and implement)
	public LinearEQ() {
		
		
	}

	
	
	// overloaded constructor takes an x-coefficient, y-coefficient, and constant
	// for linear equation of form ax + by + c = 0
		// (write signature line and implement)
	public LinearEQ(double a, double b, double c) {
		this.xcoeff = a;
		this.ycoeff = b;
		this.constant = c;
		
	}
	

	
	
	// method to round numbers to two decimals
	// (this was covered previously - use this to clean up your points)
	public double roundHundredths(double x) {
        x = (int)((xcoeff * 100) + .5) / 100.0;

        return x;

    }

	// returns the x-value of the intersection of two lines
	public double xSol(LinearEQ b){
        double x;
        x= (double)(((this.ycoeff*b.constant)-(this.constant*b.ycoeff))/
                ((this.xcoeff*b.ycoeff)-(b.xcoeff*this.ycoeff)));

        return x;
    } 
	// returns the y-value of the system's intersection

	public double ySol(LinearEQ b){ 
		double y;
		y=(double)(((this.xcoeff*b.constant)-(b.xcoeff*this.constant))/
				((this.ycoeff*b.xcoeff)-(b.ycoeff*this.xcoeff)));
		
		return y;
	}

	// returns a Point object (or myPoint object) that represents
	// the coordinate where the two lines intersect
	public Point solution(LinearEQ b){
		Point p = new Point();
		p.setLocation(this.xSol(b), this.ySol(b));
		return p;
	}
	
	

	public static void main(String[] args) {
		// example calls for constructors
		LinearEQ one = new LinearEQ(2, -3, -2);
		LinearEQ two = new LinearEQ(4, 1, 24);
		

		//include testers that can take objects one and two
		//above and print out the solution to the system
		System.out.print(one.solution(two));
		System.out.print(two.solution(one));
		
		
		
	}

}
