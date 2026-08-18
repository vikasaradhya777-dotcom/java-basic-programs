package day2;

public class overload {
	void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }public class Dmeo extends overload {
			void marry()
			{
				System.out.println("campus selected girl/boy");
			}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dmeo test = new Dmeo();// object
		test.marry();
		test.property();
	

	}

}
