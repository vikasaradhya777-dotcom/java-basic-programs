package demo;

public class RectangleArea {
	int area(int length, int breadth) {
        return length * breadth;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RectangleArea test = new RectangleArea();

	        int result = test.area(10, 5);

	        System.out.println("Area of Rectangle = " + result);
	    }
	}
	


