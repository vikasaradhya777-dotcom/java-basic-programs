package day2;
class GdParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Pt extends GdParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}
public class hirerachy extends GdParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hirerachy  bb= new hirerachy ();
 		bb.bp();
 		
	}

}
