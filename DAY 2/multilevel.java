package day2;
class GndParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class rent extends GndParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class multilevel extends rent {

	public static void main(String[] args) {
		
		multilevel  bb = new multilevel();
 		bb.bp();
 		bb.cancer();
	}

}
