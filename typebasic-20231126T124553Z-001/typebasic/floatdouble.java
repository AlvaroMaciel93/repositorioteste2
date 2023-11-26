package typebasic;

public class floatdouble {
	public static void main (String[] args) {
		double x, y;
		x = 2;
		
		do {
			y = x;
			x = x / 2;
			
		}while (x>0);
		System.out.println(y);
	}

}
